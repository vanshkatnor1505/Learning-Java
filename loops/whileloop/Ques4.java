// REVERSE NUMBER

// GIVEN ::::
// int number = 58372;

// Your algorithm must work for any positive integer, not just a 5-digit number.
// result must also be stored.

package loops.whileloop;

public class Ques4 {
    public static void main(String[] args) {
        int num = 12345;
        int result = 0;

        while (num != 0) {
            int digit =  num % 10;
            result = result * 10 + digit;
            num /= 10;
        }
        System.out.println(result);
    }
}
