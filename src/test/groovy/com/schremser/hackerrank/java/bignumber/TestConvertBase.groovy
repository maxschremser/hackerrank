package com.schremser.hackerrank.java.bignumber

import org.junit.Test

/**
 * Created by bluemax on 17.10.15.
 */
class TestConvertBase extends GroovyTestCase {

    @Test
    void test1() {
        assert ConvertBase.convert(Long.parseLong(new BigInteger("" + 123144516, 7).toString(10))) == "atlassian";
    }

    @Test
    void test2() {
        assert ConvertBase.convertBack(21152110365l) == "615441321";
    }

    @Test
    void test3() {
        assert ConvertBase.convert(66l) == "atl";
    }
}
