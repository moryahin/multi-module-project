import myJavaLibrary.Library

class TestUtilsModuleKtClass<T>(value: T) : Library<T>(value) {
    override fun foo(x: T) {
        println("override")
    }

    override fun foo(x: List<T>) {
        println("list override")
    }
}