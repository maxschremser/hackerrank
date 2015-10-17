package com.schremser.hackerrank.java.introduction;

import java.util.Scanner;

/**
 * Created by bluemax on 15.10.15.
 */
public class ReadUntilEOF {
    public static void main(String []argh)
    {
        Scanner scanner = new Scanner(System.in);
        long i = 1;
        while (scanner.hasNext()) {
            StringBuffer sb = new StringBuffer();
            sb.append(i++);
            sb.append(" ");
            sb.append(scanner.nextLine());
            System.out.println(sb.toString());
        }
    }

}
