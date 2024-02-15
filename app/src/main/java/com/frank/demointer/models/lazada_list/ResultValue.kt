package com.frank.demointer.models.lazada_list

import com.google.gson.annotations.SerializedName

data class ResultValue(
    @SerializedName("traceId")
    var traceId: String? = null,
    @SerializedName("25718")
    var twoFive: TwoFive? = null
)

data class TwoFive(
    @SerializedName("data") var data: ArrayList<LazadaItem> = arrayListOf()
)