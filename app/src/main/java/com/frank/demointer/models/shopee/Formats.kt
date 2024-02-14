package com.frank.demointer.models.shopee

import com.google.gson.annotations.SerializedName

data class Formats(
    @SerializedName("format") var format: Int? = null,
    @SerializedName("defn") var defn: String? = null,
    @SerializedName("profile") var profile: String? = null,
    @SerializedName("path") var path: String? = null,
    @SerializedName("url") var url: String? = null,
    @SerializedName("width") var width: Int? = null,
    @SerializedName("height") var height: Int? = null
)