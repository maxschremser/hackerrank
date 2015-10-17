package com.schremser.hackerrank.datastructures.linkedlists

import org.junit.Test

/**
 * Created by bluemax on 16.10.15.
 */
class TestInsertTopNode extends AbstractTestCase {

    @Test
    void test1() {
        Node head = n.Insert(null, 2);
        head = n.InsertTop(head, 1);
        assert head.toString() == "1 --> 2 --> NULL";
    }

    @Test
    void test2() {
        Node head = new Node();
        head.data = 2;
        head.next = null;
        n.Insert(head, 3);
        head = n.InsertTop(head, 1);
        assert head.toString() == "1 --> 2 --> 3 --> NULL";
    }

    @Test
    void test3() {
        Node head = new Node();
        head.data = 2;
        head.next = null;
        n.Insert(head, 3);
        n.Insert(head, 4);
        n.Insert(n.Insert(head, 5), 6);
        head = n.InsertTop(head, 1);
        assert head.toString() == "1 --> 2 --> 3 --> 4 --> 5 --> 6 --> NULL";
    }

    @Test
    void test4() {
        Node head = new Node();
        head.data = 1;
        head = n.InsertTop(head, 2);
        head = n.InsertTop(head, 3);
        head = n.InsertTop(head, 4);
        head = n.InsertTop(head, 5);
        assert head.toString() == "5 --> 4 --> 3 --> 2 --> 1 --> NULL";
    }
}
