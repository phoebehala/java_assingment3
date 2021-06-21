package ca.ciccc.wmad202.assignment3.question1;
/*
Problem 1.5
Consider two following mathematical functions:
• F1(x) = 2^x
• F2(x) = x^5
The program should find the positive number (and greater than 2), (let’s call is T) which has the
following characteristic:
• For all numbers which are less than T we have F1(x)< F2(x)
• For all numbers which are greater than or equal T we have F1(x)> F2(x)
 */
// Assignment 4 problem9
// F1(x)=F2(x)  the two curve come across
public class Question1_5 {
    public void sampleMethod(){
        System.out.println("Assignment3 - Question1_5");
        int x=2;
        while(x<100){
            double f1x=Math.pow(2,x);
            double f2x=Math.pow(x,5);
            if (f1x<f2x){
                x++;
            }
            else{
                int t=x;
                System.out.println(t);
                break;
            }
        }
    }
}
