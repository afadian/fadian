package com.github.purofle.fadian

fun interactiveMode(type: FaBing) {
    println("进入交互模式")
    while (true) {
        print("请输入对方名字： ")
        val input = readln()
        if (input == "exit") {
            break
        }

        if (input.isEmpty()) {
            println("请输入对方名字！使用 exit 退出。")
            continue
        }
        println(type.makeText(input, 0))
    }
}