// Create:
// showNumber(int number)

// When called like:
// showNumber(25);

// it should output:
// The number is: 25

// Then call the same function 3 times with different numbers.


package functions;

public class Ques2 {
    public static int showNumber(int x){
        return x;
    }
    public static void main(String[] args) {

        int a = showNumber(10);
        int b = showNumber(20);
        int c = showNumber(30);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // alternative
        // System.out.println(showNumber(10));
        // System.out.println(showNumber(20));
        // System.out.println(showNumber(30));

    }
}
