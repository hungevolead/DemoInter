package com.frank.demointer.shopee

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.frank.demointer.databinding.ItemShopeeBinding
import com.frank.demointer.models.Feed
import com.frank.demointer.models.ItemCard
import com.frank.demointer.models.Shopee
import com.frank.demointer.models.ShopeesResponse

class ShopeeAdapter(private var listShopee: MutableList<Feed>) :
    RecyclerView.Adapter<ShopeeAdapter.ViewHolder>() {
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val itemBinding = ItemShopeeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    fun setData(listShopee: List<Feed>) {
        this.listShopee.clear()
        this.listShopee.addAll(listShopee)
        notifyDataSetChanged()
    }

    fun addData(listShopee: List<Feed>) {
        this.listShopee.addAll(listShopee)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = listShopee.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listShopee[position])
    }

    inner class ViewHolder(private val binding: ItemShopeeBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(shopee: Feed) {
            //Glide.with(context).load("https://goo.gl/gEgYUd").into(binding.ivCover)
            if (shopee.feed != null && shopee.feed?.item?.itemDetail != null) {
                val itemDetail = shopee.feed?.item?.itemDetail

                val imgUrl = "https://down-vn.img.susercontent.com/file/" + itemDetail?.image
                Log.d("FrankAA", "Image url: ${imgUrl}")
                Glide.with(context).load(imgUrl).into(binding.ivCover)
                binding.tvProductName.text = itemDetail?.name
            }
        }
    }
}