package com.frank.demointer.ui.shopee

import android.content.Context
import android.os.Parcelable
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.frank.demointer.databinding.ItemShopeeBinding
import com.frank.demointer.models.shopee.Feeds
import com.frank.demointer.utils.priceFormatter
import java.text.DecimalFormat
import java.text.NumberFormat

class ShopeeAdapter(private var listShopee: MutableList<Feeds>) :
    RecyclerView.Adapter<ShopeeAdapter.ViewHolder>() {
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val itemBinding =
            ItemShopeeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    fun setData(listShopee: List<Feeds>) {
        this.listShopee.clear()
        this.listShopee.addAll(listShopee)
        notifyDataSetChanged()
    }

    fun addData(listShopee: List<Feeds>) {
        this.listShopee.addAll(listShopee)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = listShopee.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listShopee[position])
    }

    inner class ViewHolder(private val binding: ItemShopeeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(feeds: Feeds) {
            if (feeds.type == "ads_item_card") {
                feeds.adsItemCard?.ads?.let {
                    Log.d("FrankAA", "Size photo before get extra: ${it.images?.size}")
                    bindDataToView(
                        it,
                        feeds.type ?: "",
                        it.image ?: "",
                        it.name ?: "",
                        it.price ?: 0,
                        it.sold ?: 0
                    )
                }
            }

            if (feeds.type == "item_card") {
                feeds.itemCard?.item?.let {
                    bindDataToView(
                        it,
                        feeds.type ?: "",
                        it.image ?: "",
                        it.name ?: "",
                        it.price ?: 0,
                        it.sold ?: 0
                    )
                }
            }
        }

        private fun bindDataToView(
            shopeeDetail: Parcelable,
            itemType: String,
            imageUrl: String,
            name: String,
            price: Long,
            quantitySold: Int
        ) {
            val imgUrl = "https://down-vn.img.susercontent.com/file/$imageUrl"
            Glide.with(context).load(imgUrl).into(binding.ivCover)
            binding.tvProductName.text = name
            binding.tvPrice.text = "đ${priceFormatter(price)}"
            binding.tvQuantitySold.text = "Has sold ${quantitySold}"
            binding.clItemShopee.setOnClickListener {
                ShopeeDetailActivity.startActivity(context, itemType, shopeeDetail)
            }
        }
    }
}