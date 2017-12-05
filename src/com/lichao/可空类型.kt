package com.lichao

/**
 * 代表变量可能没有值的情况
 * 如：用户资料的选填部分，如地址/性别等
 * 形式：var 变量 ：类型？无则是null
 * */

fun main(args: Array<String>) {
    var addr : String = "深圳南山科技园"
    var sex : Boolean?

    if (addr != null) {
        println("您的地址是${addr}")
    }

    sex = false
    if (sex != null && sex == true) {
        println("您是男生")
    } else {
        println("您是女生")
    }
}