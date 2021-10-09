package boj.n1065


/**
 * 21.10.09
 * https://www.acmicpc.net/problem/1065
 */

fun main() = with(System.`in`.bufferedReader()) {
    print(H(readLine().toInt()))
}

fun H(N: Int): Int {
    if (N < 100) return N

    var C = 0
    for (i in 100..N) {
        val S = i.toString()
        if (S[0] - S[1] == S[1] - S[2])
            C++
    }

    return 99 + C
}

