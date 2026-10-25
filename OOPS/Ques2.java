// Example of method overloading

package OOPS;

public class Ques2 {
    void add(int a, int b) {
        System.out.println(a + b);
    }
    

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Ques2 q2 = new Ques2();
        q2.add(5, 6);
        q2.add(10, 20, 30);
    }
}
