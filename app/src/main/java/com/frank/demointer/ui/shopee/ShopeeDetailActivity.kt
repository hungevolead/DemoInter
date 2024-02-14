package com.frank.demointer.ui.shopee

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Point
import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.frank.demointer.R
import com.frank.demointer.databinding.ActivityShopeeDetailBinding
import com.frank.demointer.models.shopee.Ads
import com.frank.demointer.models.shopee.Item
import com.frank.demointer.utils.DisplayUtils
import com.google.android.material.appbar.CollapsingToolbarLayout
import java.io.Serializable

class ShopeeDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityShopeeDetailBinding

    private var itemType: String = ""
    private var ads: Ads? = null
    private var item: Item? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShopeeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get data from extras
        itemType = intent.extras?.getString(EXTRA_ITEM_TYPE) ?: ""
        if (itemType == "ads_item_card") {
            ads = intent.extras?.getParcelable(EXTRA_SHOPEE_DETAIL) as? Ads
            Log.d("FrankAA", "Size photo after get extra: ${ads?.images?.size}")
        }
        if (itemType == "item_card") {
            item = intent.extras?.getParcelable(EXTRA_SHOPEE_DETAIL) as? Item
        }

        // Setup Toolbar
        initToolbar()

        window.apply {
            clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            statusBarColor = Color.TRANSPARENT
        }

        val decor = window.decorView
        decor.systemUiVisibility = decor.systemUiVisibility or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

        // Set height of Photos view
        setupHeightOfPhotos()

        // Show Photos
        showPhotos()

        if (itemType == "ads_item_card") {
            bindDataToView(ads?.name ?: "")
        }
        if (itemType == "item_card") {
            bindDataToView(item?.name ?: "")
        }
    }

    private fun initToolbar() {
        setSupportActionBar(binding.toolbarDetailShopee)
        supportActionBar?.apply {
            title = ""
            setDisplayHomeAsUpEnabled(true)
            //setHomeAsUpIndicator(R.drawable.ic_back_white)
        }
    }

    private fun setupHeightOfPhotos() {
        //Get height of Screen Device
        val display = windowManager.defaultDisplay
        val size = Point()
        display.getSize(size)

        //Set height for ViewPager
        val params = CollapsingToolbarLayout.LayoutParams(
            CollapsingToolbarLayout.LayoutParams.WRAP_CONTENT,
            CollapsingToolbarLayout.LayoutParams.WRAP_CONTENT
        )
        params.height = (size.x / 1.5).toInt()

        binding.vpPhotos.layoutParams = params
    }

    private fun showPhotos() {
        var photos = arrayListOf<String>()
        if (itemType == "ads_item_card") {
            ads?.images?.let { photos = it }
        }
        if (itemType == "item_card") {
            item?.images?.let { photos = it }
        }
        Log.d("FrankAA", "itemType: $itemType show photo: ${photos.size}")
        val adapterPhotos = PhotosSlideAdapter(this, photos)
        binding.vpPhotos.adapter = adapterPhotos

        binding.tvPhotosNum.text = getString(R.string.format_photo_position, 1, photos.size)
        if (photos.size == 1) {
            binding.tvPhotosNum.layoutParams.width = DisplayUtils.convertDipToPixels(this, 50.0f)
        }

        binding.vpPhotos.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {}

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                binding.tvPhotosNum.text =
                    getString(R.string.format_photo_position, position + 1, photos.size)
            }
        })
    }

    private fun bindDataToView(title: String) {
        binding.body.tvTitle.text = title
    }

    companion object {
        const val EXTRA_SHOPEE_DETAIL = "EXTRA_SHOPEE_DETAIL"
        const val EXTRA_ITEM_TYPE = "EXTRA_ITEM_TYPE"
        fun startActivity(
            context: Context,
            itemType: String,
            shopeeDetail: Parcelable,
        ) {
            context.startActivity(Intent(context, ShopeeDetailActivity::class.java).apply {
                putExtra(EXTRA_ITEM_TYPE, itemType)
                putExtra(EXTRA_SHOPEE_DETAIL, shopeeDetail)
            })
        }
    }
}