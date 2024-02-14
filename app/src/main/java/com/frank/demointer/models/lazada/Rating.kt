package com.frank.demointer.models.lazada

import com.google.gson.annotations.SerializedName

data class Rating(
    @SerializedName("score") var score: Int? = null,
    @SerializedName("total") var total: Int? = null,
    @SerializedName("rating") var rating: Int? = null
)