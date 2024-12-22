package com.company.array;

public class PracticeArraySum {
    public static void main(String[] args) {
        int[] number = new int[5]; // 1

        for( int i = 0; i <5; i++) {
            number [i] = i;
        } //2

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + number[i];
        } // 3
        System.out.println(sum);
    }
}
