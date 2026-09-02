// Count Intelligence

// Given:
// int[] numbers = {12, 7, 25, 4, 18, 9, 31, 16, 22, 5};

// Your program must determine:
// EVEN COUNT : ?
// ODD COUNT  : ?

// Expected:
// EVEN COUNT : 5
// ODD COUNT  : 5


package arrays;

public class Ques5 {
    public static void main(String[] args) {
        int[] numbers = {12,7,25,4,18,9,31,16,22,5};
        int even = 0;
        int odd = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            }
            else{
                odd++;
            }
            
        }

        System.out.println("EVEN COUNT : " + even);
        System.out.println("ODD COUNT  : " + odd);
    }    
}
