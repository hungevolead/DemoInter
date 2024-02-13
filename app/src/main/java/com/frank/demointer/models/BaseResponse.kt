package com.frank.demointer.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

open class BaseResponse<T> {
    @Expose
    @SerializedName("error")
    val error: String? = null

    @Expose
    @SerializedName("error_msg")
    val errorMsg: String? = null

    @Expose
    @SerializedName("data")
    val data: T? = null
}