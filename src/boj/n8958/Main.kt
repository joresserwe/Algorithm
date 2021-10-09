package boj.n8958


/**
 * 21.10.09
 * https://www.acmicpc.net/problem/8958
 */

fun main() = with(System.`in`.bufferedReader()) {
    val st = StringBuilder()
    var N = readLine().toInt()

    repeat(N) {
        var R = 0
        var I = 0
        val D = readLine()
        D.forEach { AS ->
            when (AS) {
                'O' -> R += ++I
                'X' -> I = 0
            }
        }
        st.append(R).append("\n")
    }
    print(st.toString())
}

