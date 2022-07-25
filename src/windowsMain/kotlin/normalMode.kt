package com.github.purofle.fadian

actual fun normalMode(name: String, fadianType: FaBing, num: Int) {
    fadianType.makeText(name, num).let {
        println(it)
        openBox(it)
    }
}