package com.company.array;

public class ShiftingArray {
    public static void main(String[] args) {
        int[]a = {10, 20, 30, 40, 50};
        int firstElement= a[0];
        for (int i = 0; i < a.length-1; i++) {
            a[i] = a[i+1];

        }
        a[a.length-1] = firstElement;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
