package com.frank.demointer.models.lazada_list

import com.google.gson.annotations.SerializedName

data class Result (
    @SerializedName("result") var result: ArrayList<ResultValue> = arrayListOf()
)