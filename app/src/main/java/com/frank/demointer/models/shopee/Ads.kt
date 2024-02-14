package com.frank.demointer.models.shopee

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

class Ads() : Parcelable {
    @SerializedName("itemid")
    var itemid: Long? = null

    @SerializedName("shopid")
    var shopid: Int? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("label_ids")
    var labelIds: ArrayList<Long> = arrayListOf()

    @SerializedName("image")
    var image: String? = null

    @SerializedName("images")
    var images: ArrayList<String> = arrayListOf()

    @SerializedName("stock")
    var stock: Int? = null

    @SerializedName("sold")
    var sold: Int? = null

    @SerializedName("historical_sold")
    var historicalSold: Int? = null

    @SerializedName("liked_count")
    var likedCount: Int? = null

    @SerializedName("price")
    var price: Long? = null

    //@SerializedName("video_info_list") var videoInfoList: String? = null
    @SerializedName("item_rating")
    var itemRating: ItemRating? = ItemRating()

    @SerializedName("item_type")
    var itemType: Int? = null

    @SerializedName("reference_item_id")
    var referenceItemId: String? = null

    constructor(parcel: Parcel) : this() {
        itemid = parcel.readValue(Long::class.java.classLoader) as? Long
        shopid = parcel.readValue(Int::class.java.classLoader) as? Int
        name = parcel.readString()
        image = parcel.readString()
        images = parcel.createStringArrayList() ?: arrayListOf()
        stock = parcel.readValue(Int::class.java.classLoader) as? Int
        sold = parcel.readValue(Int::class.java.classLoader) as? Int
        historicalSold = parcel.readValue(Int::class.java.classLoader) as? Int
        likedCount = parcel.readValue(Int::class.java.classLoader) as? Int
        price = parcel.readValue(Long::class.java.classLoader) as? Long
        itemType = parcel.readValue(Int::class.java.classLoader) as? Int
        referenceItemId = parcel.readString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(itemid)
        parcel.writeValue(shopid)
        parcel.writeString(name)
        parcel.writeString(image)
        parcel.writeStringList(images)
        parcel.writeValue(stock)
        parcel.writeValue(sold)
        parcel.writeValue(historicalSold)
        parcel.writeValue(likedCount)
        parcel.writeValue(price)
        parcel.writeValue(itemType)
        parcel.writeString(referenceItemId)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Ads> {
        override fun createFromParcel(parcel: Parcel): Ads {
            return Ads(parcel)
        }

        override fun newArray(size: Int): Array<Ads?> {
            return arrayOfNulls(size)
        }
    }
}