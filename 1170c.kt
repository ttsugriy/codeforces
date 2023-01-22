fun canGet(t: String, s: String): Boolean {
    val t = t.iterator()
    val s = s.iterator()
    while (t.hasNext() && s.hasNext()) {
        val tch = t.nextChar()
        val sch = s.nextChar()
        if (tch == sch) continue
        if (tch == '-') return false // cannot transform + into -
        if (!s.hasNext() || s.nextChar() != '-') return false
    }
    return !t.hasNext() && !s.hasNext()
}

fun main() {
    val k = readln().toInt()
    repeat(k) {
        val s = readln()
        val t = readln()
        println(if (canGet(t, s)) { "YES" } else { "NO" })
    }
}