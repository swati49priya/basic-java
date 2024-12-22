package com.company.array;

public class ArreyLength {
    public static void main(String[] args) {
    int[] number = { 10, 11, 12, 13, 14}    ;
    int[] duplicateNumber = new int[number.length];
    for (int i = 0; i < number.length; i++) {
        duplicateNumber[i] = number[i];
    }
        for (int i = 0; i < duplicateNumber.length; i++)
        System.out.println(duplicateNumber[i]);
    }
}
