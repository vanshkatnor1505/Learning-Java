package practice.learning;

public class Ques5 {
    public static int add(int n){
        if (n >= 1) {
            return n + add(n-1);
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(add(8));
    }
}
