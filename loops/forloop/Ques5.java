// Print this:
// 1
// 01
// 101
// 0101
// 10101
// 010101

// For:
// int n = 6;

// And if n = 8:
// 1
// 01
// 101
// 0101
// 10101
// 010101
// 1010101
// 01010101


package loops.forloop;

public class Ques5 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i ++) {

            for (int j = 1; j <= i; j ++) {
                System.out.print((i + j) % 2);
                
            }
            System.out.println();
        }
    }
}
