package com.frank.demointer.ui.lazada

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.frank.demointer.databinding.ItemLazadaBinding
import com.frank.demointer.models.lazada_list.LazadaItem

class LazadaAdapter(private var listLazada: MutableList<LazadaItem>) :
    RecyclerView.Adapter<LazadaAdapter.ViewHolder>() {
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val itemBinding =
            ItemLazadaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    fun setData(listLazada: List<LazadaItem>) {
        this.listLazada.clear()
        this.listLazada.addAll(listLazada)
        notifyDataSetChanged()
    }

    fun addData(listLazada: List<LazadaItem>) {
        this.listLazada.addAll(listLazada)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = listLazada.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listLazada[position])
    }

    inner class ViewHolder(private val binding: ItemLazadaBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(lazadaItem: LazadaItem) {
            Glide.with(context).load(lazadaItem.itemImg).into(binding.ivCover)
            binding.tvProductName.text = lazadaItem.itemTitle
            binding.tvPrice.text = "đ${lazadaItem.itemPrice}"
            binding.tvQuantitySold.text = "Discount ${lazadaItem.itemDiscount}"
            binding.clItemLazada.setOnClickListener {
                LazadaDetailActivity.startActivity(context, lazadaItem.shopId, lazadaItem.itemId)
            }
        }
    }
}