package com.frank.demointer.models.shopee

import com.google.gson.annotations.SerializedName

data class ItemRating(
    @SerializedName("rating_star") var ratingStar: Double? = null,
    @SerializedName("rating_count") var ratingCount: ArrayList<Int> = arrayListOf(),
    @SerializedName("rcount_with_context") var rcountWithContext: Int? = null,
    @SerializedName("rcount_with_image") var rcountWithImage: Int? = null
)