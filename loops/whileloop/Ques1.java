// Controlled Countdown

// GIVEN ::::
// int number = 10;

// EXPECTED OUTPUT ::::
// 10
// 8
// 6
// 4
// 2

package loops.whileloop;

public class Ques1 {
    public static void main(String[] args) {
        int number = 10;
        while (number > 0) {
            System.out.println(number);
            number -= 2;
        }
        
    }
}
