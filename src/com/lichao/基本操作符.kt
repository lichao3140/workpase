package com.lichao

/**
 *一个符号或单词，类似数字的+ - * /，用于运算或者操作
 * 同时操作对象的数目，被称之为几元操作符
 */

fun main(args: Array<String>) {
    //操作一个目标，是一元操作符
    var a = 3
    a = 100
    var b = -a
    var c = +a
    println("${b},${c}")

    //二元操作符操作两个目标，在两个目标之间，前后用空格分隔
    var d = (a + c)
    println(c)

    //赋值操作符，用等号右边的值来更新
}
