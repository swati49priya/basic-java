package com.company.array;

public class ArrayMarks {
    public static void main(String[] args) {
        int [] marks = new int [4];
        marks[0] = 85; //physics
        marks[1] = 75; //chemistry
        marks[2] = 77; // english
        marks[3] = 79; // maths
        System.out.println(" maths: " + marks [3]);
        for(int i=0; i<4; i++) {
            System.out.println(marks[i]);
        }
    }
}
