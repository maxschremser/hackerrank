package com.schremser.hackerrank.datastructures.linkedlists

import org.junit.Test

/**
 * Created by bluemax on 16.10.15.
 */
class TestGetNode extends AbstractTestCase {

    @Test
    void test1() {
        assert n.GetNode(null, 0) == -1;
    }

    @Test
    void test2() {
        assert n.GetNode(n.Insert(n.Insert(n.Insert(n.Insert(null, 1), 2), 3), 4), 0) == 4;
    }

    @Test
    void test3() {
        assert n.GetNode(n.Insert(n.Insert(n.Insert(n.Insert(null, 1), 2), 3), 4), 1) == 3;
    }

    @Test
    void test4() {
        assert n.GetNode(n.Insert(n.Insert(n.Insert(n.Insert(null, 1), 2), 3), 4), 2) == 2;
    }

    @Test
    void test5() {
        assert n.GetNode(n.Insert(n.Insert(n.Insert(n.Insert(null, 1), 2), 3), 4), 3) == 1;
    }

}
