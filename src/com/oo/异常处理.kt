package com.oo

fun main(args: Array<String>) {
    //直接展示错误
    try {
        "abc".toInt()
    } catch (e: Exception) {
        println(e)
    }

    //忽略错误
    val a : Int? = try {
        "3abc".toInt()
    } catch (e: Exception) {
        null
    }

    println(a)
}