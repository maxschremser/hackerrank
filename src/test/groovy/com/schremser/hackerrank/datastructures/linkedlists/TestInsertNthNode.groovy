package com.schremser.hackerrank.datastructures.linkedlists

import org.junit.Test

/**
 * Created by bluemax on 16.10.15.
 */
class TestInsertNthNode extends AbstractTestCase {

    @Test
    void test1() {
        Node head = n.InsertNth(null, 3, 0);
        assert head.toString() == "3 --> NULL";
    }

    @Test
    void test2() {
        Node node = new Node();
        node.data = 3;
        n.Insert(node, 4);
        n.Insert(node, 5);
        Node head = n.InsertNth(node, 2, 0);
        assert head.toString() == "2 --> 3 --> 4 --> 5 --> NULL";
    }

    @Test
    void test3() {
        Node node = new Node();
        node.data = 0;
        n.Insert(node, 1);
        n.Insert(node, 3);
        n.Insert(node, 4);
        Node head = n.InsertNth(node, 2, 2);
        assert head.toString() == "0 --> 1 --> 2 --> 3 --> 4 --> NULL";
    }

}
