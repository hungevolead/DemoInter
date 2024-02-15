package com.frank.demointer.network

import android.util.Log
import com.google.gson.GsonBuilder
import io.harkema.retrofitcurlprinter.Logger
import io.harkema.retrofitcurlprinter.RetrofitCurlPrinterInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitClient {
    private const val BASE_URL = "https://shopee.vn"

    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}

object ApiClient {
    val apiService: ApiService by lazy {
        RetrofitClient.retrofit.create(ApiService::class.java)
    }
}

object RetrofitLazadaClient {
    private const val BASE_URL = "https://acs-m.lazada.vn"

    val retrofit: Retrofit by lazy {
        val interceptor = HttpLoggingInterceptor().apply {
            this.level = HttpLoggingInterceptor.Level.BODY
        }
        val client = OkHttpClient.Builder().apply {
            this.addInterceptor(RetrofitCurlPrinterInterceptor(object: Logger {
                override fun log(message: String) {
                    //info { message }
                    Log.d("FrankAA", "Curl: $message")
                }
            }))
                // time out setting
                //.connectTimeout(3,TimeUnit.SECONDS)
                //.readTimeout(20,TimeUnit.SECONDS)
                //.writeTimeout(25,TimeUnit.SECONDS)

        }.build()

        val gson = GsonBuilder()
            .setLenient()
            .create()
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
}

object ApiLazadaClient {
    val apiService: ApiLazadaService by lazy {
        RetrofitLazadaClient.retrofit.create(ApiLazadaService::class.java)
    }
}