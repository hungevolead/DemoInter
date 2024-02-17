package com.frank.demointer.ui.tiktok

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.frank.demointer.databinding.ItemShopeeBinding
import com.frank.demointer.databinding.ItemTiktokBinding
import com.frank.demointer.models.ItemTikTok

class TikTokAdapter(private var listTikTok: MutableList<ItemTikTok>) :
    RecyclerView.Adapter<TikTokAdapter.ViewHolder>() {
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val itemBinding =
            ItemTiktokBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    fun setData(listTikTok: List<ItemTikTok>) {
        this.listTikTok.clear()
        this.listTikTok.addAll(listTikTok)
        notifyDataSetChanged()
    }

    fun addData(listTikTok: List<ItemTikTok>) {
        this.listTikTok.addAll(listTikTok)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = listTikTok.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listTikTok[position])
    }

    inner class ViewHolder(private val binding: ItemTiktokBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(itemTikTok: ItemTikTok) {
            binding.tvDescription.text = itemTikTok.description
            binding.tvTitle.text = itemTikTok.title
            Glide.with(context).load(itemTikTok.image).into(binding.imvVideo)

            binding.cvItemTT.setOnClickListener {
                //listener?.onClickWatchVideo(itemTikTok, position)
                TikTokDetailActivity.startActivity(context, itemTikTok)
            }
        }
    }
}