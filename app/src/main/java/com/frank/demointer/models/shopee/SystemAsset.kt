package com.frank.demointer.models

import com.google.gson.annotations.SerializedName


data class SystemAsset (

  @SerializedName("type" ) var type : Int?  = null,
  @SerializedName("data" ) var data : Data? = Data()

)