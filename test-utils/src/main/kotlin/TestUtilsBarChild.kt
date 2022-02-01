fun <T> f(x: T) {
    TestModuleBar<T>(x).foo(x)
}

class BarChild<T>(value: T) : TestModuleBar<T>(value) {
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