package com.schremser.hackerrank.java.bignumber;

import java.io.*;
import java.math.*;

public class CalculateBigNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            BigInteger a = new BigInteger(br.readLine());
            BigInteger b = new BigInteger(br.readLine());
            System.out.println(new BigInteger(a.add(b).toString()));
            System.out.println(new BigInteger(a.multiply(b).toString()));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
}