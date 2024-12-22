package com.company.array;

public class NameAndMarks {

    public static void main(String[] args) {

        int[] marks = {80,90,30,100,70};
        String[] names = {"Swati", "Pankaj", "Suman", "Anand", "Tarun"};

        for(int i = 0; i <5; i++) {
            System.out.println(names[i] + " Got "+ marks[i] + " Marks");
        }
    }
}
