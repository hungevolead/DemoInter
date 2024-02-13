package com.frank.demointer.models

import com.google.gson.annotations.SerializedName


data class AdsItemCard (

  @SerializedName("ads"                  ) var ads               : Ads?               = Ads(),
  @SerializedName("item_card_label_data" ) var itemCardLabelData : ItemCardLabelData? = ItemCardLabelData(),
  @SerializedName("ui_style"             ) var uiStyle           : String?            = null,
  @SerializedName("runtime_parser_meta"  ) var runtimeParserMeta : RuntimeParserMeta? = RuntimeParserMeta()

)