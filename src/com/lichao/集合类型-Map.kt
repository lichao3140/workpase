package com.lichao

/**
 * 集合类型Map: 无序可重复
 * 主要属性：Keys (Set), values
 */

fun main(args: Array<String>) {
    //mapOf<Key, Value>(Pair(Key,value),...)
    //显示指定类型,可防止初始化类型的错误
    var airports = mapOf<String, String>(Pair("PVG", "浦东"), Pair("SHA", "虹桥"), Pair("HGH", "萧山"))

    //元素计数：size，空否：isEmpty

    //获取某个Key对应的value: get, getOrDefault
    println(airports.getOrDefault("PVG","不存在！请添加"))

    //返回所有的Key: keys, 所有的value: values
    for (key in airports.values) {
        println(key)
    }

    //mutableMapOf<Key, Value>(Pair(key, value),...)
    //可修改
    var airports2 = airports.toMutableMap()

    //添加或更新：下标方法 map 变量名[key] = value
    airports2["PVG"] = "上海国际机场"
    airports2["CSG"] = "长沙黄花机场"
    for (mutableEntry in airports2) {
        println("${mutableEntry.key},${mutableEntry.value}")
    }

    //移除元素
    airports2.remove("PVG")


}