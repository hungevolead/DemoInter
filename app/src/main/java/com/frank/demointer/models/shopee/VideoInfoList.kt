package com.frank.demointer.models.shopee

import com.google.gson.annotations.SerializedName
data class VideoInfoList(
    @SerializedName("video_id") var videoId: String? = null,
    @SerializedName("thumb_url") var thumbUrl: String? = null,
    @SerializedName("duration") var duration: Int? = null,
    @SerializedName("version") var version: Int? = null,
    @SerializedName("vid") var vid: String? = null,
    @SerializedName("formats") var formats: ArrayList<Formats> = arrayListOf(),
    @SerializedName("default_format") var defaultFormat: DefaultFormat? = DefaultFormat(),
    @SerializedName("mms_data") var mmsData: String? = null
)