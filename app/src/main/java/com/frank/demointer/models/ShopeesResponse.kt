package com.frank.demointer.models

import com.google.gson.annotations.SerializedName

class ShopeesResponse {
    @SerializedName("feeds")
    val feeds: List<Feed>? = null
}

class Feed {
    @SerializedName("feeds")
    var feed: ItemCard? = null
}