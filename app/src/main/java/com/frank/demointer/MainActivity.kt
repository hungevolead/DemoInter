package com.frank.demointer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.frank.demointer.databinding.ActivityMainBinding
import com.frank.demointer.lazada.LazadaListActivity
import com.frank.demointer.shopee.ShopeeListActivity
import com.frank.demointer.tiktok.TiktokListActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShopee.setOnClickListener {
            startActivity(Intent(this, ShopeeListActivity::class.java))
        }

        binding.btnLazada.setOnClickListener {
            startActivity(Intent(this, LazadaListActivity::class.java))
        }

        binding.btnTiktok.setOnClickListener {
            startActivity(Intent(this, TiktokListActivity::class.java))
        }
    }
}