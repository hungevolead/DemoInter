package com.frank.demointer.ui.lazada

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.frank.demointer.databinding.ActivityLazadaDetailBinding
import com.frank.demointer.ui.shopee.ShopeeDetailActivity

class LazadaDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLazadaDetailBinding
    private var shopId: Long = 0
    private var itemId: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLazadaDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initToolbar()

        // Get data from extras
        shopId = intent.extras?.getLong(EXTRA_SHOP_ID) ?: 0
        itemId = intent.extras?.getLong(EXTRA_ITEM_ID) ?: 0
    }

    private fun initToolbar() {
        setSupportActionBar(binding.lToolbar)
        supportActionBar?.apply {
            title = "Lazada Detail"
            setDisplayHomeAsUpEnabled(true)
        }

        binding.lToolbar.setNavigationOnClickListener { finish() }
    }

    companion object {
        const val EXTRA_SHOP_ID = "EXTRA_SHOP_ID"
        const val EXTRA_ITEM_ID = "EXTRA_ITEM_ID"

        fun startActivity(
            context: Context,
            shopId: Long,
            itemId: Long,
        ) {
            context.startActivity(Intent(context, LazadaDetailActivity::class.java).apply {
                putExtra(EXTRA_SHOP_ID, shopId)
                putExtra(EXTRA_ITEM_ID, itemId)
            })
        }
    }
}