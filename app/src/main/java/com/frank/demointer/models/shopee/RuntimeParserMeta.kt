package com.frank.demointer.models

import com.google.gson.annotations.SerializedName


data class RuntimeParserMeta (

  @SerializedName("feature_component_id"           ) var featureComponentId         : String?  = null,
  @SerializedName("use_client_side_data_transform" ) var useClientSideDataTransform : Boolean? = null,
  @SerializedName("handler_name"                   ) var handlerName                : String?  = null

)