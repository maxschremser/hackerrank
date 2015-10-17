package com.schremser.hackerrank.datastructures.linkedlists;

/**
 * Created by bluemax on 16.10.15.
 */
public class Node {
    int data;
    Node next;

    public Node() {
    }

    @Override
    public String toString() {
        String print = "";
        if (this != null) {
            System.out.print(this.data);
            print += this.data;
            if (this.next != null) {
                Node next = this;
                while (next.next != null) {
                    next = next.next;
                    System.out.print(" --> " + next.data);
                    print += " --> " + next.data;
                }
            }
            System.out.print(" --> NULL");
            print += " --> NULL";
        } else {
            System.out.print("NULL");
            print += "NULL";
        }
        System.out.println();
        return print;
    }
}
