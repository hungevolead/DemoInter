package com.frank.demointer.models

import com.google.gson.annotations.SerializedName


data class ExperimentInfo (

  @SerializedName("title_autogen_exp"    ) var titleAutogenExp   : String? = null,
  @SerializedName("highlight_video_exp"  ) var highlightVideoExp : String? = null,
  @SerializedName("flash_sale_label_exp" ) var flashSaleLabelExp : String? = null,
  @SerializedName("card_ui_style_exp"    ) var cardUiStyleExp    : String? = null

)