package com.oo

/**
 * 快捷定义：class 类名 constructor(属性列表) {更多的属性和方法描述}
 * 构造器：用来设置类的新实例的出厂设置
 */

open class Chinese constructor(var sex: Boolean, var region: String) {
    //普通属性
    open var skin = "yellow"
    //组合属性，由其他属性计算而来(get)
    val avgLife : Double
        get() {
            when (this.region) {
                "sh" -> {
                    return 82.4
                }
                "ah" -> {
                    return 77.8
                }
                else -> {
                    return 73.4
                }
            }
        }

    //组合属性也可以影响其他属性（set，可选）,this代表实例
    var avgSalary : Int
        get() {
            when (this.region) {
                "sh" -> {
                    return 4900
                }
                "ah" -> {
                    return 3200
                }
                else -> {
                    return 3000
                }
            }
        }
        set(value) {
            when (value) {
                in 4500..Int.MAX_VALUE -> {
                    this.region = "sh"
                }
                in 2800..3500 -> {
                    this.region = "ah"
                }
                else -> {
                    this.region = "other region"
                }
            }
        }

    //方法
    open fun cook() {
        val menu = arrayOf("青椒炒肉", "番茄炒蛋", "紫菜蛋汤")
        val desc = menu.reduce { s1, s2 -> s1 + "," + s2 }
        println("我会${desc}")
    }
}

//继承Chinese类
class HuNan(sex: Boolean, region: String = "hn") : Chinese (sex, region) {
    var dialect = "长沙滴"
    //属性覆盖
    override var skin = "HuNanYellow"
}

class SiChuan(sex: Boolean, region: String) : Chinese (sex, region) {
    var dialect = "成都人"

    override var skin = "SiChuanYellow"

    override fun cook() {
        super.cook()
        val menu = arrayOf("麻婆豆腐", "牛肉粉", "酸菜鱼")
        val desc = menu.reduce { s1, s2 -> s1 + "," + s2 }
        println("我还会${desc}")
    }
}

fun main(args: Array<String>) {
    var yaoming = HuNan(true)
    yaoming.avgSalary = 3000

    yaoming.cook()
    println(yaoming.region)
    println(yaoming.dialect)

    var yangyan = SiChuan(false, "sc")
    yangyan.cook()
    println("${yangyan.sex},${yangyan.region}")
}