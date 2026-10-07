package practice.learning;

public class Ques4 {
    public static int jasmine(int n) {
        if (n < 2) {
            return 1;
        } else {
            return n * jasmine(n - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println(jasmine(7));
    }
}
