package com.oo

/**
 * 类中嵌套其他类
 */

class News {
    //默认地区
    private var lang = "cn"

    //新闻分类： 嵌套类，与主类关系并不是十分密切，只是一个形式上的合作，主从关系
    class Category {
        var list = arrayOf("推荐", "娱乐", "体育", "科技", "美女")

        var listDesc = list.joinToString()
    }

    //内部类：新闻的语种，通常用于不直接对外的类，为主类服务
    inner class Lang{
        fun changeRegion(newRegion: String) {
            //内部类可以访问主类的属性
            lang = newRegion
            println("现在可以查看新地区${lang}的新闻")
        }
    }
}

fun main(args: Array<String>) {
    //显示中国地区的新闻列表
    println(News.Category().listDesc)

    //更改新闻地区
    News().Lang().changeRegion("US")
}