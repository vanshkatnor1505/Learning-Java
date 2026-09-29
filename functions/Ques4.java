// Create a method:
// add(int a, int b)

// It should:
// receive two integers
// add them
// return the result
// not print inside the method

// Then test it with at least 4 different calls, for example:
// add(10, 20)
// add(50, 25)
// add(7, 13)
// add(-5, 10)

// Expected results:
// 30
// 75
// 20
// 5

package functions;

public class Ques4 {

    public static int add(int a, int b) {

        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(50, 25));
        System.out.println(add(7, 13));
        System.out.println(add(-5, 10));
    }
}
