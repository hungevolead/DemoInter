package com.frank.demointer.models.shopee

import com.google.gson.annotations.SerializedName

data class Feeds(
    @SerializedName("type") var type: String? = null,
    @SerializedName("item_card") var itemCard: ItemCard? = null,
    @SerializedName("ads_item_card") var adsItemCard: AdsItemCard? = AdsItemCard(),
    @SerializedName("shopee_pay_voucher_card") var shopeePayVoucherCard: String? = null,
    @SerializedName("food_item_card") var foodItemCard: String? = null,
    @SerializedName("top_product_card") var topProductCard: String? = null,
    @SerializedName("featured_collection_card") var featuredCollectionCard: String? = null,
    @SerializedName("livestream_card") var livestreamCard: String? = null,
    @SerializedName("video_card") var videoCard: String? = null,
    @SerializedName("search_card") var searchCard: String? = null,
    @SerializedName("food_collection_card") var foodCollectionCard: String? = null,
    @SerializedName("image_search_card") var imageSearchCard: String? = null,
    @SerializedName("insurance_card") var insuranceCard: String? = null,
    @SerializedName("fashion_card") var fashionCard: String? = null,
    @SerializedName("campaign_card") var campaignCard: String? = null,
    @SerializedName("banner_card") var bannerCard: String? = null,
    @SerializedName("flash_sale_card") var flashSaleCard: String? = null,
    @SerializedName("digital_products_card") var digitalProductsCard: String? = null,
    @SerializedName("deals_nearby_card") var dealsNearbyCard: String? = null,
    @SerializedName("mall_card") var mallCard: String? = null
)