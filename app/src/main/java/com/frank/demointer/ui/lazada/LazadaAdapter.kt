package com.frank.demointer.ui.lazada

import android.content.Context
import android.os.Parcelable
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.frank.demointer.databinding.ItemLazadaBinding
import com.frank.demointer.databinding.ItemShopeeBinding
import com.frank.demointer.models.lazada.Products
import com.frank.demointer.models.shopee.Feeds
import com.frank.demointer.ui.shopee.ShopeeDetailActivity
import com.frank.demointer.utils.priceFormatter

class LazadaAdapter(private var listLazada: MutableList<Products>) :
    RecyclerView.Adapter<LazadaAdapter.ViewHolder>() {
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val itemBinding =
            ItemLazadaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    fun setData(listLazada: List<Products>) {
        this.listLazada.clear()
        this.listLazada.addAll(listLazada)
        notifyDataSetChanged()
    }

    fun addData(listLazada: List<Products>) {
        this.listLazada.addAll(listLazada)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = listLazada.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listLazada[position])
    }

    inner class ViewHolder(private val binding: ItemLazadaBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(products: Products) {
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
            binding.clItemLazada.setOnClickListener {
                ShopeeDetailActivity.startActivity(context, itemType, shopeeDetail)
            }
        }
    }
}