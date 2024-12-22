package string;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeString {
    public static void main(String[] args) {
      int arr[]= {4,9,8,7,5,1,};
      ArrayList<Integer> evenNumbers= new ArrayList<>();
      ArrayList<Integer> oddNumbers= new ArrayList<>();

      for(int i=0; i< arr.length; i++)
      {
          if(arr[i]%2==0)
          {
              evenNumbers.add(arr[i]);
          }
          else {
              oddNumbers.add(arr[i]);
          }
      }
        System.out.println("even numbers are: "+ evenNumbers);
        System.out.println("odd numbers are: "+ oddNumbers);
    }
}
