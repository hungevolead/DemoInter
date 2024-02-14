package com.frank.demointer.models.shopee

import com.google.gson.annotations.SerializedName

data class ItemCardLabelData(
    @SerializedName("image_flag") var imageFlag: ArrayList<String> = arrayListOf(),
    @SerializedName("overlay_image") var overlayImage: ArrayList<OverlayImage> = arrayListOf(),
    @SerializedName("promotion_label") var promotionLabel: ArrayList<PromotionLabel> = arrayListOf(),
    @SerializedName("extra_eligible_image_flag") var extraEligibleImageFlag: ArrayList<String> = arrayListOf(),
    @SerializedName("extra_eligible_overlay_image") var extraEligibleOverlayImage: ArrayList<String> = arrayListOf(),
    @SerializedName("extra_eligible_promotion_label") var extraEligiblePromotionLabel: ArrayList<String> = arrayListOf(),
    @SerializedName("system_asset") var systemAsset: String? = null
)