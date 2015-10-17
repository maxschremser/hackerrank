package com.schremser.hackerrank.datastructures.linkedlists

import org.junit.Test

/**
 * Created by bluemax on 16.10.15.
 */
class TestDeleteNode extends AbstractTestCase {

    @Test
    void test1() {
        Node head = n.Delete(n.Insert(null, 1), 0);
        assert head == null;
    }

    @Test
    void test2() {
        Node head = n.Delete(n.Insert(n.Insert(n.Insert(null, 3), 2), 1), 0);
        assert head.toString() == "2 --> 1 --> NULL";
    }

    @Test
    void test3() {
        Node head = n.Delete(n.Insert(n.Insert(n.Insert(null, 3), 2), 1), 1);
        assert head.toString() == "3 --> 1 --> NULL";
    }

    @Test
    void test4() {
        Node head = n.Delete(n.Insert(n.Insert(n.Insert(null, 3), 2), 1), 2);
        assert head.toString() == "3 --> 2 --> NULL";
    }

    @Test
    void test5() {
        Node head = n.Delete(n.Insert(n.Insert(n.Insert(null, 3), 2), 1), 3);
        assert head.toString() == "3 --> 2 --> 1 --> NULL";
    }

}
