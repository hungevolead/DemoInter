package com.frank.demointer.models.shopee

import com.google.gson.annotations.SerializedName

data class PromotionLabel(
    @SerializedName("type") var type: Int? = null,
    @SerializedName("data") var data: Data? = Data(),
    @SerializedName("tracking") var tracking: String? = null
)