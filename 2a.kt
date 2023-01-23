data class Entry(val name: String, val score: Int) {
    companion object {
        fun parse(s: String): Entry {
            val (name, score) = s.split(" ")
            return Entry(name, score.toInt())
        }
    }
}

fun main() {
    val n = readln().toInt()
    val entries = mutableListOf<Entry>()
    val totals = hashMapOf<String, Int>()
    repeat(n) {
        val entry = Entry.parse(readln())
        entries.add(entry)
        totals.compute(entry.name) { _, oldScore -> (oldScore ?: 0)  + entry.score }
    }

    val maxScore = totals.values.max()
    val candidates = totals.filterValues { it == maxScore }
    val runningTotals = hashMapOf<String, Int>()
    val winner = entries.filter { candidates.contains(it.name) }.first {(name, score) ->
        val totalScore = runningTotals.compute(name) { _, oldScore -> (oldScore ?: 0) + score }
        (totalScore ?: 0) >= maxScore
    }.name
    println(winner)
}