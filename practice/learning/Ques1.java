package practice.learning;

public class Ques1 {
    int b = 5;

    public static void main(String[] args) {
        // swap using third variable
        int a = 10;
        int b = 20;
        System.out.println("BEFORE SWAP : " + a + " " + b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("AFTER SWAP : " + a + " " + b);

    }
}
