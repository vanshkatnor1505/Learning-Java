// The Pattern Engine

// Write a Java program that produces the following exact output:
// 1
// 12
// 123
// 1234
// 12345
// 1234
// 123
// 12
// 1




package loops.forloop;

public class Ques3 {
    public static void main(String[] args) {
        int n = 8;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                
            }
            System.out.println();
        }
        

        for (int i = 1; i < n; i++) {

            for (int j = 1; j <= (n-i) ; j++) {
                System.out.print(j);
                
            }
            System.out.println();
        }
        

    }
}
