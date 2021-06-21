package ca.ciccc.wmad202.assignment3.question1;

import java.util.Scanner;

public class Question1_4 {
    public void sampleMethod(){
        System.out.println("Assignment3 - Question1_4");
 /* Problem 1.4
    The program keeps asking the user to enter numbers (positive or negative) until the user enters an
    invalid input. (An invalid input is an input which includes at least one alphabet, like 123d4). The
    program should print the Max and Min of the numbers the user had entered as well as the distance
    between the Max and Min. (Remember to calculate the absolute distance).

 */
// refer to Python assignment4 Problem8

        boolean firstPass=false;
        while(!firstPass) {
            Scanner in = new Scanner(System.in);
            System.out.print("Please enter a number: ");

            String firstInput = in.nextLine();
            int digitCount = 0;
            for (int i = 0; i < firstInput.length(); i++) {
                if (Character.isDigit(firstInput.charAt(i))) {
                    digitCount++;
                }
            }

            if (digitCount==firstInput.length()){
                firstPass=true;
                int firstInputNum=Integer.parseInt(firstInput);
                int largest=firstInputNum;
                int smallest=firstInputNum;
                int distanceBetweenLargestAndSmallest;

                String userInput;
                boolean valid = true;
                while (valid) {
                    userInput = in.nextLine();

                    digitCount=0;
                    for(int i=0;i<userInput.length();i++){
                        if (Character.isDigit(userInput.charAt(i))){
                            digitCount++;
                        }
                    }
                    if (digitCount==userInput.length()){
                        int userInputNum=Integer.parseInt(userInput);
                        largest=Math.max(largest,userInputNum);
                        smallest=Math.min(smallest,userInputNum);
                        distanceBetweenLargestAndSmallest=Math.abs(largest-smallest);
                    }
                    else{
                        valid=false;
                    }
            }
            System.out.println(largest);
            System.out.println(smallest);
        }
        else{
            System.out.print("invalid! Please enter a number: ");
        }
        }









    }
}
