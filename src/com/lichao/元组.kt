package com.lichao

/**
 * 元组(Tuple)给多个变量赋值, 分二元(Pair)和三元(Triple)
 */

fun main(args: Array<String>) {
    val (day, method, course) = Triple(3, "学会", "Kotlin")
    val 费用 = Pair("学费", 0)
    println("${day}天${method}${course},${费用.first}${费用.second}元！")
}