package ca.ciccc.wmad202.assignment3.question5;

import java.util.Scanner;

/*
Problem 5.5
- Write a Java program which asks the user for a number which is the length of the side of a square.
The program should find the area of a circle which is crossing from all corners of the square.
 */
public class Question5_5 {
    public void sampleMethod(){
        System.out.println("Enter the length of the side of a square: ");
        Scanner in = new Scanner(System.in);
        double length=in.nextDouble();

        double diameter=Math.sqrt(Math.pow(length,2)+Math.pow(length,2));
        double radius=diameter/2;
        //System.out.println(radius);

        double circleArea = Math.PI * (radius * radius);
        System.out.printf("The circle area is %.2f:",circleArea);

    }
}
