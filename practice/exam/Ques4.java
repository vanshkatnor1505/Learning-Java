/*
* Write a Java program that demonstrates method overloading by 
?calculating the area of a circle, rectangle and triangle 
*/


package practice.exam;

public class Ques4 {
    void area(double radius){
        double area = Math.PI * radius * radius;
        System.out.println("AREA OF CIRCLE IS : " + area);
    }

    void area(int length, int breadth){
        int area = length * breadth;

        System.out.println("AREA OF REACTANGLE : " + area);
    }

    void area(double base, double height){
        double area = .5 * base * height;

        System.out.println("AREA OF TRIANGLE : " + area);
    }
    public static void main(String[] args) {
        Ques4 a1 = new Ques4();

        a1.area(10.5);
        a1.area(12.5, 10);
        a1.area(12, 13);

    }
}
