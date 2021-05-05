package com.gb.androidkotlin.lesson

data class MyDataClass(var name: String, var age: Int)

object Santa {
    var pit = MyDataClass("Santa", 50)

        set(value) {
            field = value.copy()
            field.name="object "+field.name
        }
}