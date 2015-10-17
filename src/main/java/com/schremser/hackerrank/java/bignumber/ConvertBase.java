package com.schremser.hackerrank.java.bignumber;

import java.math.BigInteger;

/**
 * Created by bluemax on 15.10.15.
 */
public class ConvertBase {
    //                                    0   1   2   3   4   5   6
    private final static char[] base7 = {'0','a','t','l','s','i','n'};
    private final static int BASE = base7.length;
    static String convert(long in) {
        System.out.println(in);
        char[] out = Long.toString(in, BASE).toCharArray();
        System.out.println(out);
        String ret = "";
        for (int i = 0; i < out.length; i++) {
            int c = Integer.parseInt("" + out[i]);
            ret += base7[c];
        }
        return ret;
    }

    static String convertBack(long in) {
        String ret = new BigInteger("" + in, 7).toString(10);
        return ret;
    }

}
