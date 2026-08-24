// Write a Java program using a for loop that prints:
// Expected:
// 2
// 4
// 6
// 8
// 10
// 12
// 14
// 16
// 18
// 20



package loops.forloop;

public class Ques1 {
    public static void main(String[] args) {
        // for forward  order
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

        // for reverse order
        for (int i = 20; i >= 2; i -= 2) {
            System.out.println(i);
        }
    }
}
