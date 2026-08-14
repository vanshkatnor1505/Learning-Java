package operators.arrithmetic;

// Reverse a 4-Digit Number
// GIVEN :::: int number = 5837;
// EXPECTED OUTPUT :::: 7385

public class Ques8 {
    public static void main(String[] args) {
        int number = 5837;

        int first = (number/1000)%10;
        int second = (number/100)%10;
        int third = (number/10)%10;
        int fourth = (number)%10;

        
        System.out.print(fourth);
        System.out.print(third);
        System.out.print(second);
        System.out.print(first);
    }
}
