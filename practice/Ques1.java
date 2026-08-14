package practice;

// Swaping three variable without using any other variable

public class Ques1 {
    public static void main(String[] args) {
        int a = 1;  // a = 3
        int b = 2;  // b = 1
        int c = 3;  // c = 2

        System.out.println("BEFORE SWAPING " + "a = " + a + " ,b = " + b + " ,c = " + c);

        a = a + b + c;
        b = a - ( b + c );
        c = a - ( b + c );
        a = a - ( b + c );

        System.out.println("AFTER SWAPING " + "a = " + a + " ,b = " + b + " ,c = " + c);
    }
}
