package com.lichao

/**
 * 常量定义： val 常量名（任意文字、长度不限）
 * 变量定义:  var
 * 整数型： var 变量名 : Int = 3 也可以 var : 3
 * 浮点型: 默认是Double（双精度）
 */
val PI = 3.1415
val 工资 = 500
var money = 100

fun main(args: Array<String>) {
    println("常量：${PI}")
    println("常量：${工资}")
    money = money * 5;
    println("变量：${money}")

}

