package com.oo

//扑克花色
enum class PokerCard {
    红心, 方片, 梅花, 黑桃
}

//衣服尺寸：带构造器的枚举类
enum class Size(val height: Int) {
    S(150), M(160), L(170), XL(180), XXL(190)
}

fun main(args: Array<String>) {
    //列举枚举类的常量
    println(PokerCard.values().joinToString())

    //枚举常量 名称和序号 name, ordinal
    println(Size.valueOf("XXL").name)
    println(Size.valueOf("XXL").ordinal)

    println(Size.values().joinToString {it.name + ":" + it.height})
}