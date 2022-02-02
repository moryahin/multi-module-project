package com.kotlin.multimodulespringboot

import Bar
import myJavaLibrary.Library

class BarChild<T>(value: T) : Library<T>(value) {
    override fun foo(x: T) {
        println("override")
    }

    override fun foo(x: List<T>) {
        println("list override")
    }
}
fun <T> dnnFun (x:T&Any) {
    println(x)
}