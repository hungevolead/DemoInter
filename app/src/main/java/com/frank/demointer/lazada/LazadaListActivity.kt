package com.frank.demointer.lazada

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.frank.demointer.databinding.ActivityLazadaListBinding

class LazadaListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLazadaListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLazadaListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initToolbar()
    }

    private fun initToolbar() {
        setSupportActionBar(binding.lToolbar)
        supportActionBar?.apply {
            title = "Shopee List"
            setDisplayHomeAsUpEnabled(true)
        }

        binding.lToolbar.setNavigationOnClickListener { finish() }
    }
}