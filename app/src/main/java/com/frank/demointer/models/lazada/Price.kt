package com.frank.demointer.models.lazada

import com.google.gson.annotations.SerializedName

data class Price(
    @SerializedName("discountText") var discountText: String? = null,
    @SerializedName("originalPriceNumber") var originalPriceNumber: Int? = null,
    @SerializedName("originalPriceText") var originalPriceText: String? = null,
    @SerializedName("priceNumber") var priceNumber: Int? = null,
    @SerializedName("priceText") var priceText: String? = null
)