package com.schremser.hackerrank.java.strings;

import java.util.Scanner;

/**
 * Created by bluemax on 15.10.15.
 */
public class LexicographicalScanner {
    public static void main(String []argh)
    {
        // Scanner sc=new Scanner(System.in);
        Scanner sc=new Scanner("fsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH 100").useDelimiter(" ");
        // expected out
        // DJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljh
        // yotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgklj
        //String A=sc.next();
        //String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String a=sc.next();
        int k=sc.nextInt();
        String max=a.substring(0,k);
        String min=a.substring(0,k);

        for(int i=0; i+k<=a.length(); i++){
            if(a.substring(i, i+k).compareTo(min)<0) min=a.substring(i, i+k);
            if(a.substring(i, i+k).compareTo(max)>0) max=a.substring(i, i+k);
        }

        System.out.println(min);
        System.out.println(max);
    }


}
