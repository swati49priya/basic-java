package com.company.array;

public class ReverseArray2 {
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5,6,7,8,9};
        for (int i=0; i<a.length/2; i++) {
            int temp = a[i];
            a[i] = a[a.length - (i + 1)];
            a[a.length - (i + 1)] = temp;
        }
        for(int j=0; j<a.length; j++)
        {
            System.out.print(a[j]);
        }
    }
}
