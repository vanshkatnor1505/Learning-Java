package operators.arrithmetic;

// check wether number is pelindrome or not

public class Ques9 {
    public static void main(String[] args) {
        int num1 = 5837;
        int num2 = 7385;

        int first1 = (num1/1000)%10;
        int second1 = (num1/100)%10;
        int third1 = (num1/10)%10;
        int fourth1 = (num1)%10;

        int first2 = (num2/1000)%10;
        int second2 = (num2/100)%10;
        int third2 = (num2/10)%10;
        int fourth2 = (num2)%10;

        String result;

        if (first1 == fourth2 && second1 == third2 && third1 == second2 && fourth1 == first2 ) {
            result = "Palindrome";
        }
        else{
            result = " Not a Palindrome";
        }
        
        System.out.println("Original : " + num1);
        System.out.println("Reversed : " + num2);
        System.out.println("Result   : " + result);
    }
}
