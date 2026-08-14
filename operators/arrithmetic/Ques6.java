package operators.arrithmetic;

public class Ques6 {
// Three way rotation

    public static void main(String[] args) {
        int a = 10;  // a = 30
        int b = 20;  // b = 10
        int c = 30;  // c = 20

        System.out.println("BEFORE SWAPING " + "a = " + a + " ,b = " + b + " ,c = " + c);

        a = a + b + c;
        b = a - ( b + c );
        c = a - ( b + c );
        a = a - ( b + c );

        System.out.println("AFTER SWAPING " + "a = " + a + " ,b = " + b + " ,c = " + c);
    }

}
