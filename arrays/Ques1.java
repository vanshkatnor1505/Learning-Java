// Array Fundamentals

// Create this array:
// int[] numbers = {15, 28, 7, 42, 19};

// Your program must print:
// ARRAY LENGTH : 5
// FIRST        : 15
// SECOND       : 28
// MIDDLE       : 7
// FOURTH       : 42
// LAST         : 19

// Then change the first element from 15 to 100 and print:
// UPDATED FIRST : 100


package arrays;

public class Ques1 {
    public static void main(String[] args) {
        int[] numbers = {15,28,7,42,19};

        System.out.println("ARRAY LENGTH      : " + numbers.length);
        System.out.println("FIRST ELEMENT     : " + numbers[0] );
        System.out.println("SECOND ELEMENT    : " + numbers[1]);
        System.out.println("THIRD ELEMENT     : " + numbers[2]);
        System.out.println("FOURTH ELEMENT    : " + numbers[3]);
        System.out.println("FIFTH ELEMENT     : " + numbers[4]);

        numbers[0] = 100;

        System.out.println("UPDATED FIRST     : " + numbers[0]);
    } 
}
