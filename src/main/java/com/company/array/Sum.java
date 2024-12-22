package com.company.array;

import java.sql.SQLOutput;

public class Sum {
    public static void main(String[] args) {
        int a[]={3,4,5,7,9,8,2,1,6};
        int sum= 0;
        for(int i=0; i<=a.length; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
    }


}
