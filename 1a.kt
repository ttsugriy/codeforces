import kotlin.math.ceil

fun main() {
    val (n, m, a) = readln().split(" ").map { it.toDouble() }
    println((ceil(n / a) * ceil(m / a)).toLong())
}