package com.company.array;

public class SmallestNumberOfAnArray {
    public static void main(String[] args) {
        int[]number = {20, 40, 10, 15, 12};
        int smallestNumber = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] < smallestNumber) {
                smallestNumber = number[i];
            }
        }
            System.out.println("smallest number of an array is " + smallestNumber);

    }
}
