package com.frank.demointer.models

import com.google.gson.annotations.SerializedName


data class LiveStreamSession (

  @SerializedName("shop_is_live" ) var shopIsLive : Boolean? = null,
  @SerializedName("session_id"   ) var sessionId  : String?  = null,
  @SerializedName("view_cnt"     ) var viewCnt    : String?  = null

)