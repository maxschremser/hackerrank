package com.schremser.hackerrank.algorithms.warmup

/**
 * Created by bluemax on 17.10.15.
 */
class DiagonalDifference {
/*
*
3
11 2 4
4 5 6
10 8 -12

11 + 5 + (-12) = 4
10 + 5 + 4 = 19
19 - 4 = 15
*/

    def static calcDiff(matrix) {
        def sum1 = 0
        for (int i = 0; i< matrix.size; i++) {
            sum1 += matrix[i][i] as int
        }

        def sum2 = 0
        for (int i = matrix.size; i > 0; i--) {
            sum2 += matrix[i-1][matrix.size - i] as int
        }

        def ret = sum1-sum2
        if (ret < 0)
            ret = ret*-1

        return ret
    }

    static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        def numLines = br.readLine() as int
        def matrix = [][]

        for (int i = 0; i< numLines;i++) {
            matrix.push(br.readLine().split(" "))
        }

        println calcDiff(matrix)

    }
}


