package com.schremser.hackerrank.datastructures.linkedlists;

/**
 * Created by bluemax on 16.10.15.
 */
public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    @Override
    public String toString() {
        String print = "";
        if (this != null) {
            System.out.print(this.data);
            print += this.data;
            if (this.left != null) {
                TreeNode next = this;
                while (next.left != null) {
                    next = next.left;
                    System.out.print(" --> " + next.data);
                    print += " --> " + next.data;
                }
            }
            if (this.right != null) {
                TreeNode next = this;
                while (next.right != null) {
                    next = next.right;
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
