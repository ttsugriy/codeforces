fun main() {
    val m = readln()
    val xs = readln().split(' ').map { it.toInt() }
    val n = xs.count { it == -1 }
    val seqs = List(n) { ArrayList<Int>() }
    val cands = ArrayDeque(seqs.indices.toList())
    for (x in xs) {
        val seqIdx = cands.removeFirst()
        if (x == -1) continue
        seqs[seqIdx].add(x)
        cands.add(seqIdx)
    }
    println(n)
    seqs.forEach { seq ->
        println("${seq.size} ${seq.joinToString(" ")}")
    }
}