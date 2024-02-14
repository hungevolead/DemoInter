package com.frank.demointer.models.lazada

import com.google.gson.annotations.SerializedName

data class LazadaData(
    @SerializedName("module1") var module1: Module1? = Module1(),
    //@SerializedName("module3") var module3: Module3? = Module3(),
    //@SerializedName("module2") var module2: Module2? = Module2()
)