package com.frank.demointer.models.shopee

import com.google.gson.annotations.SerializedName

data class AdsItemCard(
    @SerializedName("ads") var ads: Ads? = Ads()
)