sealed class Coordinate {
    abstract fun toExcel(): Excel
    abstract fun toCanonical(): Canonical
    abstract fun toOpposite(): Coordinate

    data class Excel(val row: Int, val col: String) : Coordinate() {
        override fun toExcel(): Excel {
            return this
        }

        override fun toCanonical(): Canonical {
            var numeric = 0
            for (ch in col) {
                numeric = numeric * 26 + (ch - 'A' + 1)
            }
            return Canonical(row, numeric)
        }

        override fun toOpposite(): Coordinate {
            return toCanonical()
        }

        override fun toString(): String {
            return "$col$row"
        }
    }
    data class Canonical(val row: Int, val col: Int) : Coordinate() {
        companion object {
            val FMT: Regex = Regex("""R(\d+)C(\d+)""")
        }
        override fun toExcel(): Excel {
            val chars = mutableListOf<Char>()
            var tmp = col
            while (tmp > 0) {
                chars.add('A' + ((tmp - 1) % 26))
                tmp = (tmp - 1) / 26
            }
            return Excel(row, chars.reversed().joinToString(""))
        }
        override fun toCanonical(): Canonical {
            return this
        }

        override fun toOpposite(): Coordinate {
            return toExcel()
        }

        override fun toString(): String {
            return "R${row}C${col}"
        }
    }
}

fun main() {
    val n = readln().toInt()

    repeat(n) {
        val coord = readln()
        val match = Coordinate.Canonical.FMT.matchEntire(coord)
        val coordinate: Coordinate = if (match != null) {
            Coordinate.Canonical(match.groupValues[1].toInt(), match.groupValues[2].toInt())
        } else {
            val col = coord.takeWhile { it.isLetter() };
            Coordinate.Excel(coord.substring(col.length).toInt(), col)
        }
        println(coordinate.toOpposite())
    }
}