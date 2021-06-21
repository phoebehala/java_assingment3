package ca.ciccc.wmad202.assignment3.question5;

import java.util.Scanner;

/*Problem 5.1
- A Java program which keeps asking the user for an input which is a word until the user enters an
empty word. Then the program should find the word with the highest number of uppercase letters
and the word with the highest number of lowercase letters and prints them.

 */
public class Question5_1 {
    public void sampleMethod(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word, enter empty to exit: ");
        boolean done=false;


        int highestUppercaseCount=0;
        int highestLowercaseCount=0;
        String withHighestUppercase="";
        String withHighestLowercase="";
        while(!done){
            String word=in.nextLine();
            if(word==""){        //enter empty to exit
                done=true;
            }
            else{
                int uppercaseCountOfAWord=0;
                int lowercaseCountOfAWord=0;
                for (int i=0;i<=word.length()-1;i++){
                    if (Character.isUpperCase(word.charAt(i))){
                        uppercaseCountOfAWord++;
                    }
                    else if(Character.isLowerCase(word.charAt(i))){
                        lowercaseCountOfAWord=lowercaseCountOfAWord+1;
                    }
                }

                if (uppercaseCountOfAWord>highestUppercaseCount){
                    highestUppercaseCount=uppercaseCountOfAWord;
                    withHighestUppercase=word;
                }
                if (lowercaseCountOfAWord>highestLowercaseCount){
                    highestLowercaseCount=lowercaseCountOfAWord;
                    withHighestLowercase=word;
                }
            }
        }
        System.out.println("the word with the highest number of uppercase letters is " +withHighestUppercase);
        System.out.println("the word with the highest number of lowercase letters is " +withHighestLowercase);

    }
}

