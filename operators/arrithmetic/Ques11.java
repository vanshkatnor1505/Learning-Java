package operators.arrithmetic;

// Second Largest Digit in a 5-Digit Number
// GIVEN ::: int number = 58372;
// EXPECTED OUTPUT ::: Second Largest : 7

public class Ques11 {
    public static void main(String[] args) {
        int number = 12233;


        int first = (number/10000)%10;
        int second = (number/1000)%10;
        int third = (number/100)%10;
        int fourth = (number/10)%10;
        int fifth = (number)%10;

        int maximum ;
        int secondmaximum;

        if (first > second) {
            maximum = first;
            secondmaximum = second;
        }
        else{
            maximum = second;
            secondmaximum = first;
        }

        if (third > maximum) {
            maximum = third;
            secondmaximum = first;
        }
        else{
            if (third > secondmaximum && third < maximum) {
                secondmaximum = third;
            }
        }

        if (fourth > maximum) {
            maximum = fourth;
            secondmaximum = third;
        }
        else{
            if (fourth > secondmaximum && fourth < maximum) {
                secondmaximum = fourth;
            }
        }

        if (fifth > maximum) {
            maximum = fifth;
            secondmaximum = fourth;
        }
        else{
            if (fifth > secondmaximum && fifth < maximum) {
                secondmaximum = fifth;
            }
        }

        System.out.println("SECOND LARGEST NUMBER IS " + secondmaximum);
        
    }
}
