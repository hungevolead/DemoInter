package com.frank.demointer.models

import com.google.gson.annotations.SerializedName


data class ItemCardDisplayPrice (

  @SerializedName("item_id"                               ) var itemId                            : Int?    = null,
  @SerializedName("model_id"                              ) var modelId                           : Int?    = null,
  @SerializedName("promotion_type"                        ) var promotionType                     : Int?    = null,
  @SerializedName("promotion_id"                          ) var promotionId                       : Int?    = null,
  @SerializedName("price"                                 ) var price                             : Int?    = null,
  @SerializedName("strikethrough_price"                   ) var strikethroughPrice                : Int?    = null,
  @SerializedName("discount"                              ) var discount                          : Int?    = null,
  @SerializedName("discount_text"                         ) var discountText                      : String? = null,
  @SerializedName("hidden_price_display_text"             ) var hiddenPriceDisplayText            : String? = null,
  @SerializedName("recommended_shop_voucher_promotion_id" ) var recommendedShopVoucherPromotionId : String? = null

)