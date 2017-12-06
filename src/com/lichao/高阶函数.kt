package com.lichao

fun main(args: Array<String>) {
    //lambda中参数的约定名称为it
    var a = arrayOf(1, 2, 3, 4, 5 )
    var b = a.map { "第${it}" }

    for ( s in b) {
        println(s)
    }

    //filter:对集合类型进行筛选
    var sum = 0
    a.filter { it % 2 == 0 }.forEach {
        sum += it
        println(sum)
    }
}