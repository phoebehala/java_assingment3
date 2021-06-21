package ca.ciccc.wmad202.assignment3.question2;

public class Question2 {
    public void sampleMethod(){
        System.out.println("Assignment3 - Question2");

/*        Remember you need a new package for this Problem. Write a Java program to print the
        multiplication table for 1 to 10.
• Note: Do not need to draw the horizontal and vertical lines.
 */

 // refer to Python assignment4 Problem5

        for (int x=1;x<11;x++){
            for (int y=1;y<11;y++){
                int result=x*y;
                System.out.printf("%10d",result);
            }
            System.out.println();

        }

    }
}

