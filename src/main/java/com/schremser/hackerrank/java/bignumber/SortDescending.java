package com.schremser.hackerrank.java.bignumber;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by bluemax on 15.10.15.
 */
public class SortDescending {
    public static void main(String []argh)
    {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }

        //Write your code here
        Collections.sort(Arrays.asList(s), new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 == null)
                    return 1;
                if (o2 == null)
                    return -1;
                if (o1 == null && o2 == null)
                    return 0;
                return new BigDecimal(o1).compareTo(new BigDecimal(o2))*-1;
            }
        });


        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

    }
}
