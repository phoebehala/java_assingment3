package ca.ciccc.wmad202.assignment3.question5;

import java.util.Scanner;

/*
Problem 5.4
- Write a java program that receives a “gmail.com” email address from the input and checks
whether the email address is valid or not. A valid email address is valid or not. Imagine a valid
gmail.com email address has the following format: [username]@gmail.com
- A valid email address has exactly one @
- A valid email address has exactly one .
- A valid email address has gmail.com after@
- The username in a valid email address only contains numbers (digits), letters and _ in any order.
 */
public class Question5_4 {
    public void sampleMethod(){
        System.out.println("Enter your username@gmail.com: ");
        Scanner in = new Scanner(System.in);
        String email=in.nextLine();

        boolean isGmail=false;
        int length=email.length();

        if (email.substring(length-9,length).equals("gmail.com")){
            isGmail=true;

        }
        int atCount=0;
        int dotCount=0;
        int digitCount=0;
        int alphabetCount=0;
        int underlineCount=0;


        for (int i=0; i<email.length();i++){
            if(email.charAt(i)=='@'){
                atCount= atCount+1;
            }
            else if(email.charAt(i)=='.'){
                dotCount++;
            }
            else if (Character.isDigit(email.charAt(i))){
                digitCount++;
            }
            else if(Character.isLetter(email.charAt(i))){
                alphabetCount++;
            }
            else if(email.charAt(i)=='_'){
                underlineCount++;
            }

        }

        int totalCount=atCount+dotCount+digitCount+alphabetCount+underlineCount;

        if (atCount==1 && dotCount==1 && totalCount==email.length() && isGmail)  {
            System.out.println("The email is valid.");
        }
        else{
            System.out.println("The email is invalid.");
        }

    }
}
