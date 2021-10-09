package boj.n3052

/**
 * 21.10.09
 * https://www.acmicpc.net/problem/3052
 */

fun main() = with(System.`in`.bufferedReader()) {
    val st = StringBuilder()
    var N: Long = 0
    for (i in 1..10) N = N or (1L shl (readLine().toInt() % 42))

    print(bitCount(N))
}

fun bitCount(n: Long): Long {
    if (n == 0L) return 0
    return n % 2 + bitCount(n / 2);
}