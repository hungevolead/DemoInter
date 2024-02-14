package com.frank.demointer.ui.shopee

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.frank.demointer.R

class PhotosSlideAdapter(
    private val context: Context,
    private val photos: List<String>
) : PagerAdapter() {

    private val inflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return (view == `object`)
    }

    override fun getCount(): Int = photos.size

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val viewItem = inflater.inflate(R.layout.item_photo_detail_coworking, container, false)

        val imageView = viewItem.findViewById(R.id.ivPhotoDetail) as ImageView
        val imgUrl = "https://down-vn.img.susercontent.com/file/${photos[position]}"
        Glide.with(context).load(imgUrl).into(imageView)
        container.addView(viewItem)
        return viewItem
    }

    override fun destroyItem(container: ViewGroup, position: Int, item: Any) {
        container.removeView(item as FrameLayout)
    }
}