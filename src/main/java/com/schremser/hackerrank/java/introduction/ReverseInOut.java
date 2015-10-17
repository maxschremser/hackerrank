package com.schremser.hackerrank.java.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bluemax on 15.10.15.
 */
public class ReverseInOut {
    public static void main(String []argh)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int x = Integer.parseInt(br.readLine());
            double y = Double.parseDouble(br.readLine());
            String s = br.readLine();

            System.out.println("String: " + s);
            System.out.println("Double: " + y);
            System.out.println("Int: " + x);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
