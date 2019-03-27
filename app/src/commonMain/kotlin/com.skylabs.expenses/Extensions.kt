package com.skylabs.expenses

fun Number.padding(digits: Int): String {
    var str = "$this"
    while(str.length < digits) {
        str = "0$str"
    }
    return str
}