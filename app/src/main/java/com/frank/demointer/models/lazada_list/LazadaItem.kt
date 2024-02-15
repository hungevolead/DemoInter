package com.frank.demointer.models.lazada_list

import com.google.gson.annotations.SerializedName

data class LazadaItem (
    @SerializedName("itemRatingScore")
    var itemRatingScore: Double?,
    @SerializedName("currency")
    var currency: String,
    @SerializedName("shopId")
    var shopId: Int,
    @SerializedName("itemImg")
    var itemImg: String?,
    @SerializedName("itemTitle")
    var itemTitle: String?,
    @SerializedName("itemDiscountPrice")
    var itemDiscountPrice: String?,
    @SerializedName("itemPrice")
    var itemPrice: String?,
    @SerializedName("itemDiscount")
    var itemDiscount: String?,
)