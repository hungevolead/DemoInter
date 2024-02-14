package com.frank.demointer.models.shopee

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

class Item() : Parcelable {
    @SerializedName("itemid")
    var itemid: Long? = null

    @SerializedName("shopid")
    var shopid: Int? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("image")
    var image: String? = null

    @SerializedName("images")
    var images: ArrayList<String> = arrayListOf()

    @SerializedName("liked_count")
    var likedCount: Int? = null

    @SerializedName("price")
    var price: Long? = null

    @SerializedName("sold")
    var sold: Int? = null

    constructor(parcel: Parcel) : this() {
        itemid = parcel.readValue(Long::class.java.classLoader) as? Long
        shopid = parcel.readValue(Int::class.java.classLoader) as? Int
        name = parcel.readString()
        image = parcel.readString()
        likedCount = parcel.readValue(Int::class.java.classLoader) as? Int
        price = parcel.readValue(Long::class.java.classLoader) as? Long
        sold = parcel.readValue(Int::class.java.classLoader) as? Int
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(itemid)
        parcel.writeValue(shopid)
        parcel.writeString(name)
        parcel.writeString(image)
        parcel.writeValue(likedCount)
        parcel.writeValue(price)
        parcel.writeValue(sold)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Item> {
        override fun createFromParcel(parcel: Parcel): Item {
            return Item(parcel)
        }

        override fun newArray(size: Int): Array<Item?> {
            return arrayOfNulls(size)
        }
    }
}