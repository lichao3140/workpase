package com.lichao

/**
 *
 */

fun main(args: Array<String>) {
    //重复执行： for (a in 1..100)
    for (a in 1..100) {
        println("重要的事说100遍")
    }

    //if:条件判断语句，整个语句本身是一个表达式(可用于简单的二元判断计算)
    var a = 5
    var b = 7
    var result = if (a > b) "大于" else 0
    println(result)

    when (result) {
        in 4..10 -> {
            println("4到10之间")
        }

        (9 -6) -> {
            println("值是3")
        }

        is Int -> {
            println("值是Int型")
        }

        else -> {
            println("值是String型")
        }
    }


}