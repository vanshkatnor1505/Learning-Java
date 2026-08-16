// Permission Matrix

// GIVEN ::::
// int age = 20;
// boolean verified = true;
// boolean premium = false;
// boolean admin = false;
// boolean banned = false;

// Normal user path
// age >= 18
// AND
// verified
// AND
// NOT banned

// OR

// Premium path:

// premium AND verified AND NOT banned

// OR

// Admin path
// admin
// AND
// NOT banned

package operators.logical;

public class Ques2 {
    public static void main(String[] args) {
        int age = 20;
        boolean verified = true;
        boolean premium = true;
        boolean admin = false;
        boolean banned = false;

        boolean access = (age >= 18 && verified && !banned) || (premium && verified && !banned) || (admin && !banned);
        System.out.println(access);
    }
}
