package ca.ciccc.wmad202.assignment3.question5;

import  java.util.Scanner;

/*Problem 5.2
- Write a program which receives a word and checks whether the word is semi- palindrome. A
word is semi-palindrome if it becomes palindrome if one of its letters is removed from the word.
For instance, ‘acda’ is semi-palindrome because if the letter ‘c’ or the letter ‘d’ is removed from
‘acda’, then it becomes palindrome.
 */
public class Question5_2 {
    public void sampleMethod() {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Enter a string to check if it is a palindrome");
        original = in.nextLine();

        int length = original.length();
        boolean isSemiPalindrome=false;

        for (int i = 0; i <= length - 1; i++) {
            String substring = original.substring(0, i) + original.substring(i+1, length );
            //System.out.println(substring);
            reverse="";
            for (int j=substring.length()-1;j>=0;j--){
                reverse=reverse+substring.charAt(j);
            }
            //System.out.println(reverse);
            if(reverse.equals(substring)){
                isSemiPalindrome=true;
            }
        }

        if (isSemiPalindrome){
            System.out.println(original+" is semi-palindrome.");
        }
        else{
            System.out.println(original+" is not semi-palindrome");
        }









    }
}



