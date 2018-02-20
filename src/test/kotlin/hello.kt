
package org.kx.a

fun main(args: Array<String>) {    // 包级可见的函数，接受一个字符串数组作为参数
    println("Hello World!")         // 分号可以省略
    Greeter("nick").greet()

    if (args.size == 0) {
        println("Please provide a name as a command-line argument")
        return
    }
    println("Hello, ${args[0]}!")
}


class Greeter(val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}

