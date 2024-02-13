package com.frank.demointer.models

import com.google.gson.annotations.SerializedName


data class Toggle (

  @SerializedName("system_asset" ) var systemAsset : ArrayList<SystemAsset> = arrayListOf()

)