package com.frank.demointer.models.lazada_list

import com.google.gson.annotations.SerializedName


data class LazadaListData(
    //@SerializedName("result") var result: Result? = null
    @SerializedName("result") var result: ArrayList<ResultValue> = arrayListOf()
)