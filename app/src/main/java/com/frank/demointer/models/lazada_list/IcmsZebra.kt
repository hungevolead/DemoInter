package com.frank.demointer.models.lazada_list

import com.google.gson.annotations.SerializedName

data class IcmsZebra(
    @SerializedName("data") var data: ArrayList<LazadaItem> = arrayListOf(),
)