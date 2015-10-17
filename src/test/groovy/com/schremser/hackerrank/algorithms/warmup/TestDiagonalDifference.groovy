package com.schremser.hackerrank.algorithms.warmup

import org.junit.Test

class TestDiagonalDifference extends GroovyTestCase {

    @Test
    void test1() {
        def matrix = [[11,2,4], [4,5,6], [10,8,-12]]
        assert DiagonalDifference.calcDiff(matrix) == 15
    }

    @Test
    void test2() {
        def matrix = [[1,2,3], [4,5,6], [7,8,9]]
        assert DiagonalDifference.calcDiff(matrix) == 0
    }

    @Test
    void test3() {
        def matrix = [[1,2,1], [0,1,0], [1,2,1]]
        assert DiagonalDifference.calcDiff(matrix) == 0
    }
}
