package com.frank.demointer.models

import com.google.gson.annotations.SerializedName


data class Data (

  @SerializedName("tabs"       ) var tabs      : String?          = null,
  @SerializedName("feeds"      ) var feeds     : ArrayList<Feeds> = arrayListOf(),
  @SerializedName("feed_total" ) var feedTotal : Int?             = null,
  @SerializedName("toggle"     ) var toggle    : Toggle?          = Toggle()

)