package boj.n4673


/**
 * 21.10.09
 * https://www.acmicpc.net/problem/4673
 */

fun main() = with(System.`in`.bufferedReader()) {
    val G = BooleanArray(10001)
    val BW = System.out.bufferedWriter()

    for (i in 1..10000) {
        if (!G[i]) BW.appendLine(i.toString())
        var KI = i
        i.toString().forEach { KI += it.digitToInt() }
        if (KI > 10000) continue;
        G[KI] = true
    }
    BW.close()
}
