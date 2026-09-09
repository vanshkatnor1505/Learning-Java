// Array Intelligence

// Given:
// int[] numbers = {
//     12, 7, 4, 12, 9, 7, 15, 4, 20, 9, 3
// };

// Print:
// LARGEST
// SMALLEST
// SUM
// AVERAGE
// EVEN COUNT
// ODD COUNT

// But here's the restriction:
// Only ONE for loop.
// No second traversal.


package practice;

public class Ques7 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 4, 12, 9, 7, 15, 4, 20, 9, 3};
        int largest = numbers[0];
        int smallest = numbers[0];
        int sum  =  0;
        double average;
        int evencount = 0;
        int oddcount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            sum += numbers[i];

            if (numbers[i] % 2 ==  0) {
                evencount ++;
            }else{
                oddcount ++;
            }
            
        }
        average = (double) sum/ numbers.length;

        System.out.println("LARGEST     : " + largest);
        System.out.println("SMALLEST    : " + smallest);
        System.out.println("SUM         : " + sum);
        System.out.println("AVERAGE     : " + average);
        System.out.println("EVEN COUNT  : " + evencount);
        System.out.println("ODD COUNT   : " + oddcount);
    }
}
