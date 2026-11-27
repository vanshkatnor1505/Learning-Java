/*
* Code to find factorial using recursion
 */

package practice.exam;

public class Ques1 {

    int fact(int a){
        if ( a <= 1) {
            return 1;
        }
        else{
            return a * fact(a - 1);
        }

        
    }
    public static void main(String[] args) {
        Ques1 a1 = new Ques1();

        System.out.println(a1.fact(7));
    }
}
