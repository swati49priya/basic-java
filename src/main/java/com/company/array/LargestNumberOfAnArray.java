package com.company.array;

public class LargestNumberOfAnArray {
    public static void main(String[] args) {
        int[]number = {5,6,7,9,2,8,1 };
        int largestNumber = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] > largestNumber) {
                largestNumber  = number[i];

            }
        }
        System.out.println("Largest number of an array is " + largestNumber);
    }
}
