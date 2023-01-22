fun main() {
    readln().toInt()
    val xs = readln().split(" ").map { it.toInt() }
    var badDays = 0
    var (mx1, mx2) = listOf(0, 0)
    for (x in xs) {
        if (x < mx2) badDays += 1
        else if (x > mx1) {
            mx2 = mx1
            mx1 = x
        } else {
            mx2 = x
        }
    }
    println(badDays)
}