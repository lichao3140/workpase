package com.itf

//接口定义: interface 接口名 {//各种属性或方法定义}

interface Livable {
    var hasSkill: Boolean
}

interface ChinaLivable {
    //接口中的属性只有类型定义，不可以初始化
    val hasJobOffer: Boolean

    //接口中的属性可以有get,通常用于单纯增加一个常量属性
    val visaCategory: String
        get() = "工作签证"

    //接口中的变量属性
    var city : String

    //接口中的方法
    fun speakChinese()

    //接口中的方法可以有默认实现，通常指该方法的固定不变的
    fun handGuanXi() {
        println("处理人际关系")
    }
}

open class Person {
    var name = ""
}

class ForigenChinese: Person(), Livable, ChinaLivable {
    override var hasSkill = true

    override val hasJobOffer = true

    override var city = ""

    override fun speakChinese() {
       println("我叫${this.name}")
    }
}

fun main(args: Array<String>) {
    var tom = ForigenChinese()
    tom.name = "唐恩"

    tom.speakChinese()
    tom.handGuanXi()

    print(tom.visaCategory)
    print(tom.hasSkill)
}