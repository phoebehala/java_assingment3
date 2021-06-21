package ca.ciccc.wmad202.assignment3.question1;

import java.util.Scanner;


public class Question1_1 {
    public void sampleMethod(){
        System.out.println("Assignment3 - Question1_1");

/*
        Problem 1.1
        Read a number from input (like 123). You make the assumption that the user does not enter a
        decimal number (like 123.4). The number entered by the user should not be divisible by 10 and if
        the user enters a number that is divisible by 10 (like 560), it is considered invalid and the
        application should keep asking until the user enters a valid input. Once the user enters a valid input,
                the program calculates the reverse of the number (for 153, the reverse is 351) and prints the result.
*/
// python assignment4 problem6

        Scanner in =new Scanner(System.in);

        boolean valid = false;
        int userInput;
        while (!valid) {
            System.out.print("Please enter a number which is not divisible by ten: ");
            userInput = in.nextInt();
            if (userInput % 10 != 0) {
                valid = true;

                int reverseNum=0;
                while (userInput>0){
                    int remainder =userInput%10;
                    reverseNum=reverseNum*10+remainder;
                    userInput=userInput/10;    //userInput is a integer, so the division is also an integer.

                    //System.out.println(reverseNum);
                    //System.out.println(userInput);
                }


                System.out.printf("The reversed number is %d:",reverseNum);
                System.out.println();


            } else {
                System.out.println("Invalid input.");
            }
        }







    }
}
