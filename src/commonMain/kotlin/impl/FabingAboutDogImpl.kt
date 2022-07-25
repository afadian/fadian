package com.github.purofle.fadian.impl

import com.github.purofle.fadian.Data
import com.github.purofle.fadian.FaBing

class FabingAboutDogImpl: FaBing {
    override fun makeText(name: String, num: Int): String = Data.text.replace("{name}", name)
    override fun makeText(name: String): String = makeText(name, 0)
}