fun printNumbers(vararg numbers: Int) {
    for (n in numbers) {
        println(n)
    }
}

fun main() {
    val arr = intArrayOf(1, 2, 3, 4)
    printNumbers(*arr)   // use *
}
