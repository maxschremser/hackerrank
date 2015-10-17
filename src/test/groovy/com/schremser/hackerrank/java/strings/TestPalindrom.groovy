package com.schremser.hackerrank.java.strings

import org.junit.Test

/**
 * Created by bluemax on 17.10.15.
 */
class TestPalindrom extends GroovyTestCase {

    @Test
    void test1() {
        assert Palindrom.isPalindrom("aabaa") == "Yes";
    }

    @Test
    void test2() {
        assert Palindrom.isPalindrom("madam") == "Yes";
    }

    @Test
    void test3() {
        assert Palindrom.isPalindrom("") == "Yes";
    }

    @Test
    void test4() {
        assert Palindrom.isPalindrom("mama") == "No";
    }
}
