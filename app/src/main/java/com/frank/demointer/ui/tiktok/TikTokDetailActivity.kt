package com.frank.demointer.ui.tiktok

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import com.frank.demointer.databinding.ActivityTiktokDetailBinding
import com.frank.demointer.models.ItemTikTok

class TikTokDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTiktokDetailBinding
    private var itemTikTok: ItemTikTok? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTiktokDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initToolbar()

        // Get data from extras
        itemTikTok = intent.extras?.getSerializable(EXTRA_TIKTOK_DETAIL) as? ItemTikTok
        itemTikTok?.let {
            binding.tvTitle.text = it.title
            binding.tvDescription.text = it.description
            binding.tvAuthor.text = it.author
            it.video?.let { video ->
                val mediaController = MediaController(this)
                mediaController.setAnchorView(binding.videoView)
                binding.videoView.setMediaController(mediaController)
                binding.videoView.setVideoPath(video)
                binding.videoView.start()

            }

        }
    }

    private fun initToolbar() {
        setSupportActionBar(binding.tToolbar)
        supportActionBar?.apply {
            title = "TikTok Detail"
            setDisplayHomeAsUpEnabled(true)
        }

        binding.tToolbar.setNavigationOnClickListener { finish() }
    }

    companion object {
        const val EXTRA_TIKTOK_DETAIL = "EXTRA_TIKTOK_DETAIL"

        fun startActivity(
            context: Context,
            itemTikTok: ItemTikTok,
        ) {
            context.startActivity(Intent(context, TikTokDetailActivity::class.java).apply {
                putExtra(EXTRA_TIKTOK_DETAIL, itemTikTok)
            })
        }
    }
}