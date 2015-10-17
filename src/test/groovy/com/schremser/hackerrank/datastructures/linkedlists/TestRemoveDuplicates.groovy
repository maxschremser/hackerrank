package com.schremser.hackerrank.datastructures.linkedlists

import org.junit.Test

/**
 * Created by bluemax on 16.10.15.
 */
class TestRemoveDuplicates extends AbstractTestCase {

    @Test
    void test1() {
        Node list = n.Insert(n.Insert(n.Insert(n.Insert(n.Insert(n.Insert(null, 1), 1), 3), 3), 4), 5)
        assert n.RemoveDuplicates(list).toString() == "1 --> 3 --> 4 --> 5 --> NULL";
    }

    @Test
    void test2() {
        assert n.RemoveDuplicates(null) == null;
    }

}
