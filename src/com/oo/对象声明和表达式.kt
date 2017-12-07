package com.oo

open class ChinesePeople(var name: String) {
    open val skin = "yellow"
}

fun main(args: Array<String>) {
    val baako = object : ChinesePeople("Baako Zaid") {
        override val skin = "black"
    }

    println(baako.skin)

    //纯对象表达式
    val tempParking = object {
        var x = 100
        var y = 200
    }

    println(tempParking.x)

    //相当与调用函数
    NetworkRequestManager.register()
    //伴生方法，与类的关联性强
    IDCard.create()
}

//对象声明，不能用在函数中，一般用于对其他类的一种使用上的包装
object NetworkRequestManager {
    fun register() {
        println("连接网络注册中...")
    }
}

//伴生对象：一般用于创建一个类的实例的“工厂”方法，java中的静态方法
class IDCard {
    companion object {
        fun create() = IDCard()
    }
}
