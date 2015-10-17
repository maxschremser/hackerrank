package com.schremser.hackerrank.java.strings;

import java.util.Scanner;

/**
 * Created by bluemax on 15.10.15.
 */
public class CompareString {
    public static void main(String []argh)
    {
        // Scanner sc=new Scanner(System.in);
        Scanner sc=new Scanner("b d").useDelimiter(" ");
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        StringBuffer buf = new StringBuffer(A.substring(0,1).toUpperCase());
        buf
                .append(A.substring(1))
                .append(" ")
                .append(B.substring(0,1).toUpperCase())
                .append(B.substring(1));
        System.out.print(buf.toString());
    }


}
