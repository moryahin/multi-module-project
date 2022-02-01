package com.kotlin.multimodulespringboot

import Bar

fun <T> f(x: T) {
    Bar<T>(x).foo(x)
}

class BarChild<T>(value: T) : Bar<T>(value) {
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