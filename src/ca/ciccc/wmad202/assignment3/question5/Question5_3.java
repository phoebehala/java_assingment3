package ca.ciccc.wmad202.assignment3.question5;
/*Problem 5.3
Implement the MonteCarlo approach to estimate the PI (=3.14) number. The solution exists in the
lecture note slide 62-63. Try the MonteCarlo approach for 100 tries, 1000 tries and 10000 tries
and print the estimated value for PI for these numbers of tries.
 */
public class Question5_3 {
    public void sampleMethod(){
        double pi=0;
        double s=1;
        int n=10000;
        for (int i=0;i<n;i=i+2){
            pi+=s/i;
            s=-s;
        }
        System.out.println(pi*4);


    }
}
