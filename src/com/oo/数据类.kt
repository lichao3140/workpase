package com.oo

/**
 * Kotlin数据类：data class 类名（属性列表）
 */

data class Article(var id: Int, var title: String)

fun main(args: Array<String>) {
    val article = Article(1001, "Kotlin入门")

    //数据的序列化
    println(article.toString())

    //复制 copy:生成一个对象的克隆，并更改部分属性
    val articleNewTitle = article.copy(title = "Android Kotlin开发")
    println(articleNewTitle.toString())

    //数据类对象的解构
    val (id, title) = article
    println("$id, $title")
    println("${article.component2()}")

}