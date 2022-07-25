package com.github.purofle.fadian

import platform.windows.MB_OK
import platform.windows.MessageBoxA

fun openBox(text: String) {
    MessageBoxA(null, text, "fadian", MB_OK)
}