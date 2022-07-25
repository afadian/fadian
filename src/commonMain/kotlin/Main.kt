package com.github.purofle.fadian

import com.github.purofle.fadian.impl.FabingAboutDogImpl
import com.github.purofle.fadian.impl.FabingImpl
import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default
import kotlinx.cli.optional

fun main(args: Array<String>) {
    val parser = ArgParser("fadian")
    val name by parser.argument(ArgType.String, description = "发癫对象").optional()
    val mode by parser.option(ArgType.Choice(listOf("interactive", "normal"), { it })).default("normal")
    val type by parser.option(ArgType.Choice(listOf("fabing", "dog"), { it })).default("dog")
    val num by parser.option(ArgType.Int).default(0)

    parser.parse(args)

    val fadianType = if (type == "fabing") {
        FabingImpl()
    } else {
        FabingAboutDogImpl()
    }

    if ((name.isNullOrEmpty()) and (mode == "normal")) {
        println("参数错误！请正确填写 name 字段。使用 --help 查看帮助。")
        return
    }

    if (mode == "interactive") {
        interactiveMode(fadianType)
    } else {
        normalMode(name!!, fadianType, num)
    }

}