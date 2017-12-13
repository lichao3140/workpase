package com.itf

fun main(args: Array<String>) {
    //自定义一个泛型函数： <T>,Type的首字母缩写，T代表一个占位符，用尖括号包含
    fun <类型占位符> showText(para: 类型占位符) {
        println(para)
    }

    showText(3)
    showText("我是泛型函数")

    //运用系统自带的函数.求和
    val sum = arrayOf(1, 3, 5, 6, -4, 9).sum()
    println(sum)

    //泛型约束： <泛型占位符：类型>
    fun <T: Number> sum(vararg numbers: T): Double {
        return numbers.sumByDouble { it.toDouble() }
    }
    println(sum(1, 3, 4.6, 6, 8, -9))

    //多种约束：where,各个约束用逗号分割，写在函数体之前
    //例子：把数组中大于某个元素（阈值）的部分取出并升序排列
    //(99, 1, 2, -389, 88, 1024, 8888)  >  (88, 99, 1024, 8888)
    fun <T> biggerPart(list: Array<T>, threhold: T): List<T> where T: Number, T: Comparable<T>{
        return list.filter { it >= threhold }.sorted()
    }

    val b = arrayOf(99, 1, 2, -389, 88, 1024, 8888)

    println(biggerPart(b, 3))

}