package com.frank.demointer.models.lazada

import com.google.gson.annotations.SerializedName

data class Products(
    @SerializedName("ad") var ad: Boolean? = null,
    @SerializedName("adFlag") var adFlag: String? = null,
    @SerializedName("ad_src") var adSrc: String? = null,
    @SerializedName("bdayTag") var bdayTag: Boolean? = null,
    @SerializedName("discount") var discount: String? = null,
    @SerializedName("image") var image: String? = null,
    @SerializedName("impUrl") var impUrl: String? = null,
    @SerializedName("isSoldOut") var isSoldOut: Boolean? = null,
    @SerializedName("is_sponsored") var isSponsored: Boolean? = null,
    @SerializedName("itemId") var itemId: String? = null,
    @SerializedName("link") var link: String? = null,
    @SerializedName("originalPrice") var originalPrice: String? = null,
    @SerializedName("pdp_sku") var pdpSku: String? = null,
    @SerializedName("pid") var pid: String? = null,
    @SerializedName("price") var price: Price? = Price(),
    @SerializedName("rating") var rating: Rating? = Rating(),
    @SerializedName("ratingNumber") var ratingNumber: Int? = null,
    @SerializedName("salePrice") var salePrice: String? = null,
    @SerializedName("sellerId") var sellerId: String? = null,
    @SerializedName("skuId") var skuId: String? = null,
    @SerializedName("soldCnt") var soldCnt: Int? = null,
    @SerializedName("sp_params") var spParams: String? = null,
    @SerializedName("spmPosition") var spmPosition: String? = null,
    @SerializedName("sponsoredIcon") var sponsoredIcon: String? = null,
    @SerializedName("title") var title: String? = null

)