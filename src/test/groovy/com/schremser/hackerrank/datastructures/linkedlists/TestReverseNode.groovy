package com.schremser.hackerrank.datastructures.linkedlists

import org.junit.Test

/**
 * Created by bluemax on 16.10.15.
 */
class TestReverseNode extends AbstractTestCase {

    @Test
    void test1() {
        Node head = n.Reverse(null);
        assert head == null;
    }

    @Test
    void test2() {
        Node list = n.Insert(null, 1);
        Node head = n.Reverse(list);
        assert head.toString() == "1 --> NULL";
    }

    @Test
    void test3() {
        Node list = n.Insert(n.Insert(null, 1), 2);
        Node head = n.Reverse(list);
        assert head.toString() == "2 --> 1 --> NULL";
    }

    @Test
    void test4() {
        Node list = n.Insert(n.Insert(n.Insert(null, 1), 2), 3);
        Node head = n.Reverse(list);
        assert head.toString() == "3 --> 2 --> 1 --> NULL";
    }

    @Test
    void test5() {
        Node list = n.Insert(n.Insert(n.Insert(n.Insert(null, 1), 2), 3), 4);
        Node head = n.Reverse(list);
        assert head.toString() == "4 --> 3 --> 2 --> 1 --> NULL";
    }

}
