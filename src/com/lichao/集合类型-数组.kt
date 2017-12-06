package com.lichao

/**
 * 同类型的值的组合，根据整体特征分:
 * 1.有序可重复 - Array
 * 2.无序不重复 - Set
 * 3.无序可重复 - Map，但值有唯一的键(Key)
 */

fun main(args: Array<String>) {
    //Array: Array<类型> 或 arrayOf(元素1，元素2，...，元素n)
    var nollstations = arrayOf("深大", "高新园", "白石洲", "世界之窗", "车公庙", "高新园")

    for (nollstation in nollstations) {
        println(nollstation)
    }

    //创建一个有默认值的数组, Array(计数,{默认值})
    var nollstationNames = Array(20, {"20个地铁站名"})
    for (nollstationName in nollstationNames) {
        println(nollstationName)
    }

    //创建1到10数组:Array(10, {i -> i + 1})
    //i代表元素的索引值，从0开始
    var oneToTen = Array(100, {i -> i +1})
    for (i in oneToTen) {
        println(i)
    }

    //元素计数：count(),空否：isEmpty()
    println(oneToTen.isEmpty())

    //获取其中元素：数组名[索引]，首元素:数组名.first, 尾元素:数组名.last
    //获取前5个元素的快捷办法.component1到5
    println(oneToTen[6 - 1])
    println("${oneToTen.component1()},${oneToTen.component2()}")

    //获取筛选重复元素后的数组:.distinct() 或用.toSet转换为Set
    var nollStationNoRepeat = nollstations.distinct()
    for (s in nollStationNoRepeat) {
        println(s)
    }

    //切割数组：sliceArray
    var smallStation = nollstations.sliceArray(0..1)
    for (small in smallStation) {
        println(small)
    }

    //mutableList: MutableList<类型>或mutableListOf(元素1，元素2，...，元素n)
    //大小可变，类型不可变
    var nollNewsStations = mutableListOf("深大", "高新园", "白石洲", "世界之窗", "车公庙")
    var newStations = arrayOf("会展中心", "东门", "罗湖")

    //在末尾增加元素:add方法。添加另一个数组addAll方法
    nollNewsStations.add("竹子林")
    nollNewsStations.addAll(newStations)
    for ( stations in nollNewsStations) {
        println(stations)
    }

    //移除元素remove,移除指定位置removeAt
    nollNewsStations.removeAll(newStations)

}