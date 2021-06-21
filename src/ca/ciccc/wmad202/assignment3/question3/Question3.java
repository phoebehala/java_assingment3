package ca.ciccc.wmad202.assignment3.question3;

/*        Problem3
        Remember you need a new package for this Problem. Write a Java program which
        receives a string from input and does the following:
• Reverse the string and print it
• Check whether the input string and the its reverse is the same (like BaBa). It
        considers case-sensitivity which means (Baba and BaBa are not the same)

 */
// WMAD 102 Assignment 1 function problem10

public class Question3 {
    public void sampleMethod(){
        System.out.println("Assignment3 - Question3");

        String originalS="abb";
        String reverse="";

        char [] letters =new char[originalS.length()];

        int letterIndex=0;
        for(int i=originalS.length()-1;i>=0;i--){
            letters[letterIndex]=originalS.charAt(i);
            letterIndex++;
        }


        for (int i=0;i<originalS.length();i++){
            reverse=reverse+letters[i];
        }


        if (reverse.equals(originalS)){
            System.out.printf("the input string \"%s\" and its reverse \"%s\" is the same",originalS,reverse);
        }else{
            System.out.printf("the input string \"%s\" and its reverse \"%s\" is not the same",originalS,reverse);
        }

    }
}

/* call function?

    public static void main(String[] args){
        String r =reverse("dog");
        System.out.println(r);
    }

    public static String reverse(String s){
        char [] letters =new char[s.length()];

        int letterIndex=0;
        for(int i=s.length()-1;i>=0;i--){
            letters[letterIndex]=s.charAt(i);
            letterIndex++;

        }

        String reverse="";
        for (int i=0;i<s.length();i++){
            reverse=reverse+letters[i];
        }

        return reverse;


    }


 */
