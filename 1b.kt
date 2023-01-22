sealed class Coordinate {
    companion object {
        fun parse(s: String): Coordinate {
            val match = Canonical.FMT.matchEntire(s)
            return if (match != null) {
                Canonical(match.groupValues[1].toInt(), match.groupValues[2].toInt())
            } else {
                val col = s.takeWhile { it.isLetter() };
                Excel(s.substring(col.length).toInt(), col)
            }
        }
    }

    fun toOpposite(): Coordinate {
        return when (this) {
            is Excel -> toCanonical()
            is Canonical -> toExcel()
        }
    }

    data class Excel(val row: Int, val col: String) : Coordinate() {
        fun toCanonical(): Canonical {
            var numeric = 0
            for (ch in col) {
                numeric = numeric * 26 + (ch - 'A' + 1)
            }
            return Canonical(row, numeric)
        }

        override fun toString(): String {
            return "$col$row"
        }
    }
    data class Canonical(val row: Int, val col: Int) : Coordinate() {
        companion object {
            val FMT: Regex = Regex("""R(\d+)C(\d+)""")
        }
        fun toExcel(): Excel {
            val chars = mutableListOf<Char>()
            var tmp = col
            while (tmp > 0) {
                chars.add('A' + ((tmp - 1) % 26))
                tmp = (tmp - 1) / 26
            }
            return Excel(row, chars.reversed().joinToString(""))
        }

        override fun toString(): String {
            return "R${row}C${col}"
        }
    }
}

fun main() {
    repeat(readln().toInt()) { println(Coordinate.parse(readln()).toOpposite()) }
}