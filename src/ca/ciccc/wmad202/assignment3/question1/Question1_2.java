package ca.ciccc.wmad202.assignment3.question1;

import java.util.Scanner;

public class Question1_2 {
    public void sampleMethod(){
        System.out.println("Assignment3 - Question1_2");

        /*  Problem 1.2
    Read two numbers from input (like A and B)
    • First prints all numbers between A and B (A and B not included), which are divisible to
    both 3 and 5.
    • Then prints all numbers between A and B (A included by B not included), which are
    divisible by either 6 or 7.
    • Finally prints all numbers between A and B (A and B both included), which are not
    divisible by 3.
 */
        // refer to Python assignment4 Problem3

        Scanner userInput =new Scanner(System.in);
        System.out.println("Please enter a number:");
        int a=userInput.nextInt();

        System.out.println("Please enter the other number:");
        int b=userInput.nextInt();

        //int maximum=Math.max(a,b);
        //int minimum=Math.min(a,b);

        if (a<b){

            System.out.println("the number between A and B (A and B not included) divisible by both 3 and 5 are ");
            for (int x=a+1;x<b;x++){
                if (x%3==0 && x%5==0){
                    System.out.printf("%d ",x);

                }
            }

            System.out.println();
            System.out.println("the number between A and B (A included but B not included) divisible by 6 or 7 are ");
            for(int x=a;x<b;x++){
                if(x%6==0 || x%7==0){
                    System.out.printf("%d ",x);

                }
            }


            System.out.println();
            System.out.println("the number between A and B ((A and B both included) not divisible by 3 are ");
            for(int x=a;x<b+1;x++){
                if(x%3!=0){
                    System.out.printf("%d ",x);

                }
            }


        }


        else{

            System.out.println("the number between A and B (A and B not included) divisible by both 3 and 5 are ");
            System.out.println();
            for (int x=b+1;x<a;x++){
                if (x%3==0 && x%5==0){
                    System.out.printf("%d ",x);
                }
            }


            System.out.println();
            System.out.println("the number between A and B (A included but B not included) divisible by 6 or 7 are ");
            for(int x=b;x<a;x++){
                if(x%6==0 && x%7==0){
                    System.out.printf("%d ",x);
                }
            }


            System.out.println();
            System.out.println("the number between A and B ((A and B both included) not divisible by 3 are ");
            for(int x=b;x<a+1;x++){
                if(x%3!=0){
                    System.out.printf("%d ",x);
                }
            }


        }














    }

}
