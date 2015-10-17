package com.schremser.hackerrank.datastructures.linkedlists;

/**
 * Created by bluemax on 16.10.15.
 */
public class InsertNode {

    /**
     *
     * @param head the head of the Node
     * @param data the value to be inserted at the end of head
     * @return the head
     */
    public static Node Insert(Node head,int data) {
        if (head == null) {
            head = new Node();
            head.data = data;
            head.next = null;
        } else {
            Node tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = null;
            tail.next = newNode;
        }
        return head;
    }

    /**
     *
     * @param head the head of the Node
     * @param x the data for the new head
     * @return the new head
     */
    public static Node InsertTop(Node head,int x) {
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = head;
        return newNode;
    }

    /**
     *
     * @param head the head of the Node
     * @param data the data to be inserted
     * @param position the Position where to insert in the LinkedList
     * @return the modified head
     */
    public static Node InsertNth(Node head, int data, int position) {
        if (head == null) {
            head = new Node();
            head.data = data;
            head.next = null;
        } else {
            if (position == 0) {
                Node newHead = new Node();
                newHead.data = data;
                newHead.next = head;
                head = newHead;
            } else {
                Node node = head;
                for (int i = 0; i < position - 1; i++) {
                    node = node.next;
                }
                Node next = new Node();
                next.data = data;
                next.next = node.next;
                node.next = next;
            }
        }
        return head;
    }

    /**
     *
     * @param head the head of the Node
     * @param position the Position of the Node to be deleted
     * @return the modified head of the new list
     */
    public static Node Delete(Node head, int position) {
        if (position == 0) {
            head = head.next;
        } else {
            Node node = head;
            for (int i = 0; i < position-1 && node.next != null; i++) {
                 node = node.next;
            }
            if (node.next != null)
                node.next = node.next.next;
        }
        return head;
    }

    /**
     *
     * @param head of the list to be reversed
     * @return the modified head of the new list
     */
    public static Node Reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node next = head.next;
        head.next = null;
        Node last = Reverse(next);
        next.next = head;
        return last;
    }

    /**
     *
     * @param head the head of the linked list
     * @param n the position to return starting from tail
     * @return
     */
    public static int GetNode(Node head,int n) {
        Node result = head;
        if (head == null)
            return -1;

        // move head n positions away from result
        for (int i = 0; i < n; ++i) {
            head = head.next;
        }

        // once head reaches null, result is correct
        while (head.next != null) {
            head = head.next;
            result = result.next;
        }
        return result.data;
    }

    /**
     *
     * @param head the list to remove duplicates
     * @return
     */
    public static Node RemoveDuplicates(Node head) {
        if ( head == null ) return null;
        Node nextItem = head.next;
        while ( nextItem != null && head.data == nextItem.data ) {
            nextItem = nextItem.next;
        }
        head.next = RemoveDuplicates( nextItem );
        return head;
    }

}
