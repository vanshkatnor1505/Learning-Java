// recursive function for fibnocci series

package functions;

public class Ques6 {
    static int fibnocci(int n){
        if (n <= 1) {
            return n;
        }
        return fibnocci(n-1) + fibnocci(n-2);
    }
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            System.out.print(fibnocci(i) + " ");
        }
    }
}
