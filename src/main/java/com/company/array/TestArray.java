package com.company.array;

public class TestArray {

    public static void main(String[] args) {

        int [] numbers = new int[10];

        System.out.println("Java initializes int array with value 0 : ");
        for(int i = 0; i <= 9; i++) {
            System.out.println(numbers[i]);
        }

        for (int i = 0; i <= 9; i++) {
            numbers[i] = i;
        }

        System.out.println("After changing value : ");
        for(int i = 0; i <= 9; i++) {
            System.out.println(numbers[i]);
        }

    }
}
