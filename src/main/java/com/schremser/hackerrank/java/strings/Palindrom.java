package com.schremser.hackerrank.java.strings;

import java.util.Scanner;

/**
 * Created by bluemax on 15.10.15.
 */
public class Palindrom {
    public static void main(String []argh)
    {
        // Scanner sc=new Scanner(System.in);
        Scanner sc=new Scanner("aabca").useDelimiter(" ");
        /* Enter your code here. Print output to STDOUT. */
        String a=sc.next();

        System.out.println(isPalindrom(a));
    }

    static String isPalindrom(String in) {
        boolean isPalindrom = true;
        for (int i = 0; i < in.length()/2; i++) {
            isPalindrom = in.substring(i, i+1).equals(in.substring(in.length()-i-1, in.length()-i));
        }
        return isPalindrom ? "Yes" : "No";
    }
}
