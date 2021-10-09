package boj.n4344

import java.util.*

/**
 * 21.10.09
 * https://www.acmicpc.net/problem/4344
 */

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()

    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        val N = st.nextToken().toInt()
        val R = IntArray(N) { st.nextToken().toInt() }
        var AVG = R.average()
        sb.append("%.3f".format(R.count { it > AVG } * 100 / N.toDouble())).append("%\n")
    }
    print(sb.toString())
}
/*
5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91
 */