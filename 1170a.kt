import kotlin.math.max
import kotlin.math.min

fun main() {
    val q = readln().toInt()
    repeat(q) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        val b = min(x, y) - 1
        val c = max(x, y) - b
        println("1 $b $c")
    }
}