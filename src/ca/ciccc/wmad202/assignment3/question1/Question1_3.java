package ca.ciccc.wmad202.assignment3.question1;

public class Question1_3 {
    public void sampleMethod(){
        System.out.println("Assignment3 - Question1_3");

        int decimal=8;
        int binary[] = new int[40];
        int index = 0;
        while(decimal > 0){
            binary[index++] = decimal%2;
            decimal = decimal/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }

}

