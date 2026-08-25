// Now we're getting nasty
// Let's combine numbers + spaces + alternating logic.
// For:
// int n = 5;
// Print:
//     1
//    121
//   12321
//  1234321
// 123454321

// For n = 8:
//        1
//       121
//      12321
//     1234321
//    123454321
//   12345654321
//  1234567654321
// 123456787654321

package loops.forloop;

public class Ques7 {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i < n; i ++) {
            System.out.print(" ");
        }
        System.out.println(1);
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k);

            }
            for (int j = i+1; j > 0; j--) {

                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}
