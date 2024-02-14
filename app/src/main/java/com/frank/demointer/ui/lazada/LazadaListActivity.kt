package com.frank.demointer.ui.lazada

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.frank.demointer.R
import com.frank.demointer.common.ItemOffsetDecoration
import com.frank.demointer.databinding.ActivityLazadaListBinding
import com.frank.demointer.models.BaseResponse
import com.frank.demointer.models.lazada.LazadaData
import com.frank.demointer.models.shopee.Data
import com.frank.demointer.network.ApiClient
import com.frank.demointer.network.ApiLazadaClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LazadaListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLazadaListBinding
    private lateinit var lazadaApdater: LazadaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLazadaListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initToolbar()

        initAdapter()

        getInitData()
    }

    private fun initToolbar() {
        setSupportActionBar(binding.lToolbar)
        supportActionBar?.apply {
            title = "Lazada List"
            setDisplayHomeAsUpEnabled(true)
        }

        binding.lToolbar.setNavigationOnClickListener { finish() }
    }

    private fun initAdapter() {
        lazadaApdater = LazadaAdapter(mutableListOf())
        binding.rvLazada.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(context, 2)
            addItemDecoration(
                ItemOffsetDecoration(context, R.dimen.spacing_tiny)
            )
            adapter = lazadaApdater
        }
    }

    private fun getInitData() {
        val call = ApiLazadaClient.apiService.getDetailLazada()
        call.enqueue(object: Callback<BaseResponse<LazadaData>> {
            override fun onResponse(
                call: Call<BaseResponse<LazadaData>>,
                response: Response<BaseResponse<LazadaData>>
            ) {
                if (response.isSuccessful) {
                    val spr = response.body()
                    // Success
                    Log.d("FrankAA", "Call api success size: ${spr?.data?.module1?.products?.size}")
                    if (spr?.data != null && !spr.data.module1?.products.isNullOrEmpty()) {
                        lazadaApdater.setData(spr.data.module1?.products ?: mutableListOf())
                    }
                } else {
                    // Error
                    Log.d("FrankAA", "Call api error")
                }
            }

            override fun onFailure(call: Call<BaseResponse<LazadaData>>, t: Throwable) {
                // Fail
                Log.d("FrankAA", "Call api fail: ${t.message}")
            }
        })
    }
}