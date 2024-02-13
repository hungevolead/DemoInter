package com.frank.demointer.models

import com.google.gson.annotations.SerializedName

class ItemCard {
    @SerializedName("type")
    var type: String? = null
    @SerializedName("item_card")
    var item: Item? = null
}

class Item {
    @SerializedName("item")
    var itemDetail: ItemDetail? = null
}

class ItemDetail {
    @SerializedName("itemid")
    var itemId: Long = 0
    @SerializedName("shopid")
    var shopId: Long = 0
    @SerializedName("name")
    var name: String? = null
    @SerializedName("image")
    var image: String? = null
    @SerializedName("video_info_list")
    var videoInfoList: List<VideoInfo>? = null
}

class VideoInfo {
    @SerializedName("formats")
    var formats: List<VideoFormat>? = null
}

class VideoFormat {
    @SerializedName("url")
    var url: String? = null
}