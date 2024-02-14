package com.frank.demointer.models.shopee

import com.google.gson.annotations.SerializedName

data class OverlayImage(
    @SerializedName("type") var type: Int? = null,
    @SerializedName("data") var data: Data? = Data()
)