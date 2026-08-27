// Now let's make the pattern actually think

// For:

// int n = 5;

// produce:

// 1
// 22
// 333
// 4444
// 55555
// 4444
// 333
// 22
// 1

// But here's the restriction:

// You must use ONE outer loop.

package loops.forloop;

public class Ques9 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j <= i; j ++) {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j <= n - i; j ++) {
                System.out.print(n-i);
            }
            System.out.println();
        }
    }

}
