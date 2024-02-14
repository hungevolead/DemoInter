package com.frank.demointer.models.shopee

import com.google.gson.annotations.SerializedName

data class ItemCard(
    @SerializedName("item") var item: Item? = Item(),
    //@SerializedName("item_card_label_data") var itemCardLabelData: ItemCardLabelData? = ItemCardLabelData(),
    @SerializedName("ui_style") var uiStyle: String? = null,
    @SerializedName("runtime_parser_meta") var runtimeParserMeta: RuntimeParserMeta? = RuntimeParserMeta(),
    @SerializedName("autoplay_priority") var autoplayPriority: Int? = null
)