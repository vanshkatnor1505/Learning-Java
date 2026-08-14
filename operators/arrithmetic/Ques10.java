package operators.arrithmetic;

// find middle digit of any five digit number

public class Ques10 {
    public static void main(String[] args) {
        int num = 12345;

        int middle = (num/100)%10;
        
        System.out.println(middle);
        
    }
}
