package com.frank.demointer.utils

import java.text.DecimalFormat
import java.text.NumberFormat

fun priceFormatter(price: Long?): String {
    if (price == null) {
        return "0"
    }
    val formatter: NumberFormat = DecimalFormat("#,###")
    return formatter.format(price / 10000)
}