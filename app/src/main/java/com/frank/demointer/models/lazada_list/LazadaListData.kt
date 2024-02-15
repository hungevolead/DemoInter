package com.frank.demointer.models.lazada_list

import com.google.gson.annotations.SerializedName


data class LazadaListData(
    @SerializedName("resultValue") var resultValue: ResultValue? = null
)