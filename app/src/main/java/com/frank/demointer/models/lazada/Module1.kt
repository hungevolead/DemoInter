package com.frank.demointer.models.lazada

import com.google.gson.annotations.SerializedName

data class Module1(
    @SerializedName("costTime") var costTime: Int? = null,
    @SerializedName("index") var index: Int? = null,
    @SerializedName("jumpURL") var jumpURL: String? = null,
    @SerializedName("products") var products: ArrayList<Products> = arrayListOf(),
    @SerializedName("rUTArgs") var rUTArgs: String? = null,
    @SerializedName("recommendType") var recommendType: String? = null,
    @SerializedName("scm") var scm: String? = null,
    @SerializedName("title") var title: String? = null,
    @SerializedName("type") var type: Int? = null
)