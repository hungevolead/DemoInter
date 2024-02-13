package com.frank.demointer.tiktok

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.frank.demointer.databinding.ActivityTiktokListBinding

class TiktokListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTiktokListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTiktokListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initToolbar()
    }

    private fun initToolbar() {
        setSupportActionBar(binding.tToolbar)
        supportActionBar?.apply {
            title = "Shopee List"
            setDisplayHomeAsUpEnabled(true)
        }

        binding.tToolbar.setNavigationOnClickListener { finish() }
    }
}