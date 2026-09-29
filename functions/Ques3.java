// Create a method:
// square(int number)

// It should:
// receive an integer
// calculate its square
// return the result
// not print anything inside the method

// For example:
// square(5) → 25
// square(8) → 64
// square(12) → 144

// Then in main():
// Call it with three different numbers
// Print the returned results.

package functions;

public class Ques3 {

    public static int square(int number){

        int result = number * number;

        return result;
    }
    public static void main(String[] args) {
        System.out.println(square(5));
        System.out.println(square(3));
        System.out.println(square(7));
    }
}
