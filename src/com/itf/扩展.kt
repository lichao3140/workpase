package com.itf

//Kotlin支持：扩展函数、扩展属性

//扩展函数：fun 接受者类型，新扩展函数名（参数类别）{//函数实现}

//1、普通函数扩展：整数的平方
fun Int.square(): Int {
    return this * this
}

fun main(args: Array<String>) {
    println(3.square())

    val b = arrayOf(99, 1, 2, -389, 88, 1024, 8888)

    //println(b.max())
    println(b.biggest())
}

//2、泛型函数扩展：取数字型数组中最大的元素
fun <T> Array<T>.biggest (): T where T: Number, T: Comparable<T> {
    var biggest = this[0]

    for (i in 1..lastIndex) {
        var element = this[i]

        if (element > biggest) {
            biggest = element
        }
    }

    return biggest
}
