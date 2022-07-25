package com.github.purofle.fadian.impl

import com.github.purofle.fadian.Data
import com.github.purofle.fadian.FaBing

class FabingImpl: FaBing {
    /**
     * 发病实现
     */
    override fun makeText(name: String, num: Int): String {
        /**
         * @param name 名字
         * @param num 数据的数量
         */
        if (num == 0) {
            return Data.fadian.joinToString { it.replace("{name}", name) }
        }
        val tmpList = mutableListOf<String>()
        for (i in 0 until num) {
            tmpList.add(Data.fadian.random())
        }
        return tmpList.joinToString { it.replace("{name}", name) }
    }

    override fun makeText(name: String): String = makeText(name, 0)
}