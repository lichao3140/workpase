package com.lichao

/**
 *集合类型 Set:无序不重复
 * 主要方法：交差并补
 */

fun main(args: Array<String>) {
    //Set<类型> 或 setOf(元素1，元素2，...，元素n)
    //大小固定，元素类型不可以变

    var mainLine = setOf("迪士尼", "徐家汇", "桃浦新村", "南翔", "马陆", "嘉定新城")
    var sublineJd = setOf("嘉定新城", "嘉定西", "嘉定北")
    var sublineKs = setOf("嘉定新城", "上海赛车场", "安亭", "花桥")

    //元素计数:count(),空否：isEmpty()
    println(mainLine.count());

    //检查是否包含某个元素:contains, 包含另一个Set:containsAll
    println(mainLine.containsAll(sublineJd))

    //转换为数组：toTypedArray()
    //mainLine.toTypedArray()

    //集合之间的运算：intersect/subtract/union/minus(补集的被操作对象无须是Set类型)
    var interchange = mainLine.intersect(sublineJd)
    println(interchange)


}