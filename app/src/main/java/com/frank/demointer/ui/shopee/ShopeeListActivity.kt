package com.frank.demointer.ui.shopee

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.frank.demointer.R
import com.frank.demointer.common.ItemOffsetDecoration
import com.frank.demointer.databinding.ActivityShopeeListBinding
import com.frank.demointer.models.BaseResponse
import com.frank.demointer.models.shopee.Data
import com.frank.demointer.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ShopeeListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityShopeeListBinding
    private lateinit var shopeeAdapter: ShopeeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShopeeListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initToolbar()

        initAdapter()

        getInitData()
    }

    private fun initToolbar() {
        setSupportActionBar(binding.sToolbar)
        supportActionBar?.apply {
            title = "Shopee List"
            setDisplayHomeAsUpEnabled(true)
        }

        binding.sToolbar.setNavigationOnClickListener { finish() }
    }

    private fun initAdapter() {
        shopeeAdapter = ShopeeAdapter(mutableListOf())
        binding.rvShopee.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(context, 2)
            addItemDecoration(
                ItemOffsetDecoration(context, R.dimen.spacing_tiny)
            )
            adapter = shopeeAdapter
        }
    }

    private fun getInitData() {
        val call = ApiClient.apiService.getListShopee()
        call.enqueue(object: Callback<BaseResponse<Data>> {
            override fun onResponse(
                call: Call<BaseResponse<Data>>,
                response: Response<BaseResponse<Data>>
            ) {
                if (response.isSuccessful) {
                    val spr = response.body()
                    // Success
                    Log.d("FrankAA", "Call api success size: ${spr?.data?.feeds?.size}")
                    if (spr?.data != null && !spr.data.feeds.isNullOrEmpty()) {
                        shopeeAdapter.setData(spr.data.feeds)
                    }
                } else {
                    // Error
                    Log.d("FrankAA", "Call api error")
                }
            }

            override fun onFailure(call: Call<BaseResponse<Data>>, t: Throwable) {
                // Fail
                Log.d("FrankAA", "Call api fail: ${t.message}")
            }
        })
    }
}