package practice;

// Swaping two variables using third variable

public class Ques2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 9;
        int temp;
        
        System.out.println("BEFORE SWAPING " + "a = " + a + " ,b = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("AFTER SWAPING " + "a = " + a + " ,b = " + b);
    }
}
