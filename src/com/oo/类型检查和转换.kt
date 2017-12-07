package com.oo

fun main(args: Array<String>) {
    val a = 5
    val b = 6

    val c = if (a > b) "大于" else a - b

    //类型判断：is
    if (c is String) println(c.length)

    if (c !is String) println("整数：$c")

    //智能转换
    if (c is Int) println(c.inc())

    //手动转换：强制转换as, 安全转换as?
    val d = c as? String
    println("d是c强制转换后的c,值是$d")
}