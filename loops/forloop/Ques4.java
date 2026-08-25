// Now I'm taking away the easy part

// Print this for:
// int n = 5;
// 1
// 22
// 333
// 4444
// 55555

// If:
// int n = 8;
// it should automatically become:
// 1
// 22
// 333
// 4444
// 55555
// 666666
// 7777777
// 88888888


package loops.forloop;

public class Ques4 {
    public static void main(String[] args) {
        int n = 8;

        for (int i = 1; i <= n; i ++) {

            for (int j = 1; j <= i; j ++) {
                System.out.print(i);
            }
            System.out.println();

        }
    }
}
