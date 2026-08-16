package operators.logical;

// Access Control

// GIVEN :::
// int age = 22;
// boolean verified = true;
// boolean banned = false;

// A user is allowed to access the system only when:

// age is at least 18
// user is verified
// user is NOT banned

public class Ques1 {
    public static void main(String[] args) {
        int age =  22;
        boolean verified = true;
        boolean banned = false;

        boolean access = age > 17 && verified && !banned;

        System.out.println(access);
    }
}
