package com.github.purofle.fadian

actual fun normalMode(name: String, fadianType: FaBing, num: Int) {
    println(fadianType.makeText(name, num))
}