package com.frank.demointer.models.shopee

import com.google.gson.annotations.SerializedName

data class VoucherInfo(
    @SerializedName("promotion_id") var promotionId: Int? = null,
    @SerializedName("voucher_code") var voucherCode: String? = null,
    @SerializedName("label") var label: String? = null
)