package operators.assignment;

// Variable Transformation

// GIVEN ::: int x = 10;

// Apply these operations in exactly this order:

// 1. Add 15
// 2. Multiply by 3
// 3. Subtract 20
// 4. Divide by 5
// 5. Add the remainder when 17 is divided by 4
// 6. Multiply by 2


public class Ques2 {
    public static void main(String[] args) {
        int x = 10;
        x += 15;
        x *= 3;
        x -= 20;
        x /= 5;
        x += (17%4);
        x *= 2;

        System.out.println("VALUE OF x AFTER ALL OPERATIONS : " + x);
        
    }
}
