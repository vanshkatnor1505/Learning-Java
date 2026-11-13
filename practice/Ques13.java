// print reverse counting using recursion 


package practice;
public class Ques13 {

    void count(int num) {

        if ( num <=0 ) {
            return;
        }

        System.out.println(num);

        count(num - 1);

    }

    public static void main(String[] args) {
        Ques13 ob = new Ques13();

        ob.count(7);
    }
}
