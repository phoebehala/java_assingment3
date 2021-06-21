package ca.ciccc.wmad202.assignment3.question4;

/*     Problem4
The Java program receives a statement which contains only alphabet variables and binary
operations including +, -, *, / and % and check whether the statement is a valid arithmetic
statement or not.
• The statement might contain parenthesis as well. For instance:
• a+b*a+c/c%y
• (a+b)*(a/d-(a/b))
• You can make this assumption that the variable names contain only one alphabet
(like a, b, c) and cannot have more than one alphabets (like ab, temp, sum, …)
816 Granville Street, Vancouver, BC, Canada V6Z 1K3 T: 604-620-1111
www.ciccc.ca info@ciccc.ca
• Remember from the lecture that 2 conditions should be satisfied in order an
arithmetic operation is considered valid. Search in your lecture notes for it if you
don’t remember it.

         */
// WMAD 102 Assignment 1 function problem11


import java.util.Scanner;

public class Question4 {
    public void sampleMethod(){
        System.out.println("Assignment3 - Question4");

        Scanner in=new Scanner(System.in);
        System.out.println("Enter a arithmetic statement: ");
        String arithmeticStatement =in.nextLine();


        boolean containCorrect=false;
        int alphabetCount=0;
        int binaryOperationsCount=0;
        int parenthesisCount=0;

        for (int i=0;i<=arithmeticStatement.length()-1;i++){         // Check Whether a Character is Alphabet or Not
            if (arithmeticStatement.charAt(i)>='a' && arithmeticStatement.charAt(i)<='z'
                    || arithmeticStatement.charAt(i)>='A' && arithmeticStatement.charAt(i)<='Z'){
                alphabetCount=alphabetCount+1;
            }
            else if(arithmeticStatement.charAt(i)=='+'
                    || arithmeticStatement.charAt(i)=='-'
                    || arithmeticStatement.charAt(i)=='*'
                    || arithmeticStatement.charAt(i)=='/'
                    || arithmeticStatement.charAt(i)=='%'){
                binaryOperationsCount=binaryOperationsCount+1;
            }
            else if(arithmeticStatement.charAt(i)=='('
                    || arithmeticStatement.charAt(i)==')'){
                parenthesisCount=parenthesisCount+1;
            }
        }

        if (alphabetCount+binaryOperationsCount+parenthesisCount==arithmeticStatement.length()){
            containCorrect=true;
        }


        if (containCorrect && parenthesisCount%2==0){         //parenthesisCount%2==0   parenthesis s/b pairs
            System.out.println("The arithmetic statement is valid.");
        }
        else{
            System.out.println("invalid arithmetic statement." );
        }



    }
}
