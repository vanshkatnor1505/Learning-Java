// The Number Pyramid

// Write a Java program using for loops that prints this for n = 5:

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// For n = 7, it should automatically become:

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19 20 21
// 22 23 24 25 26 27 28



package loops.forloop;

public class Ques8 {
    public static void main(String[] args) {
        int n = 9;
        int number = 1;

        for (int i = 1; i <= n; i ++) {
            for (int j = 0; j <= i - 1; j ++) {
                System.out.print(number);
                System.out.print(" ");
                number ++;
            }
            System.out.println();
        }
    }
}
