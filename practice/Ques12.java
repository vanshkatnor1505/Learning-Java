package practice;
public class Ques12 {

    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(double a, double b){
        return a + b;
    }


    public static void main(String[] args) {
        Ques12 ob = new Ques12();

        ob.add(2.5, 4.5);
        ob.add(4, 5);
        ob.add(3, 5, 7);
    }
}
