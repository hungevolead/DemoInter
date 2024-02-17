package com.frank.demointer.ui.tiktok

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.frank.demointer.R
import com.frank.demointer.common.ItemOffsetDecoration
import com.frank.demointer.databinding.ActivityTiktokListBinding
import com.frank.demointer.models.ItemTikTok
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import org.json.JSONObject

class TiktokListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTiktokListBinding
    private lateinit var tiktokAdapter: TikTokAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTiktokListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initToolbar()

        initAdapter()

        getData()
    }

    private fun initToolbar() {
        setSupportActionBar(binding.tToolbar)
        supportActionBar?.apply {
            title = "TikTok List"
            setDisplayHomeAsUpEnabled(true)
        }

        binding.tToolbar.setNavigationOnClickListener { finish() }
    }

    private fun initAdapter() {
        tiktokAdapter = TikTokAdapter(mutableListOf())
        binding.rvTikTok.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            addItemDecoration(
                ItemOffsetDecoration(context, R.dimen.spacing_tiny)
            )
            adapter = tiktokAdapter
        }
    }

    private fun getData() {
        Thread {
            //Do some Network Request
            val client = OkHttpClient().newBuilder()
                .build()
            val request: Request = Request.Builder()
                .url("https://api.tiktokv.com/aweme/v1/challenge/aweme/?ch_id=1666225759256578&count=20&offset=0&max_cursor=0&type=5&query_type=0&is_cold_start=1&pull_type=1&cursor=0")
                .method("GET", null)
                .addHeader(
                    "User-Agent",
                    "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/119.0.0.0 Safari/537.36"
                )
                .addHeader(
                    "Accept",
                    "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"
                )
                .build()
            val response: Response = client.newCall(request).execute()
            val body = response.body()?.string()
            Log.d("FrankAA", "Call api success body: ${body}")
            if (body.isNullOrEmpty()) {
                return@Thread
            }

            val listData = mutableListOf<ItemTikTok>()

            val json = JSONObject(body)
            val awemeList = json.getJSONArray("aweme_list")

            for (i in 0 until awemeList.length()) {
                val item = awemeList.getJSONObject(i)
                var video = ""
                var image = ""
                val desc = item.getString("desc")
                val signature = item.getJSONObject("author").getString("signature")
                if (item.has("video")) {
                    video = item.getJSONObject("video").getJSONObject("play_addr")
                        .getJSONArray("url_list").getString(0)
                    image = item.getJSONObject("video").getJSONObject("origin_cover")
                        .getJSONArray("url_list").getString(0)


                }

                val tiktokItem = ItemTikTok(
                    id = item.getString("aweme_id"),
                    title = signature,
                    description = desc,
                    author = signature,
                    image = image,
                    video = video,
                )
                listData.add(tiktokItem)
            }

            runOnUiThread {
                //Update UI
                tiktokAdapter.setData(listData)
            }
        }.start()
    }
}