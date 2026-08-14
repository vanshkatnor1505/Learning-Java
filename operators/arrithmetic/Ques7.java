package operators.arrithmetic;

// DIGIT MANIPULATION 

// we have int number = 5837;
// print each digit seperately in new line

public class Ques7 {
    public static void main(String[] args) {

        int number = 5873;
        
        System.out.println((number/1000)%10);
        System.out.println((number/100)%10);
        System.out.println((number/10)%10);
        System.out.println(number%10);
        
    }
}
