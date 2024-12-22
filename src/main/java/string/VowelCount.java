package string;

import java.util.List;

public class VowelCount {
    public static void main(String[] args) {
        String s= "Swati";
        String str= s.toLowerCase();
        int vowelCount=0;
        int consonantCount=0;

        List<Character> vowels = List.of('a','e','i','o','u');

        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);
            if(vowels.contains(ch))
            {
                vowelCount++;
            }
            else {
                consonantCount++;
            }
        }
        System.out.println("Vowel count= "+ vowelCount);
        System.out.println("Consonant count= "+ consonantCount);
    }
}
