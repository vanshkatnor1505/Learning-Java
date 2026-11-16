/*
* Create a Java class named AreaCalculator with three overloaded methods named area():
? 1. area(int side) – Calculate the area of a square.
? 2. area(int length, int breadth) – Calculate the area of a rectangle.
? 3. area(double radius) – Calculate the area of a circle.
*/

package functions;

class AreaCalculator {
    void area(int side) {

        System.out.print("AREA OF SQUARE IS : ");
        System.out.println(side * side);

    }

    void area(int length, int breadth) {

        System.out.print("AREA OF RECTANGLE IS : ");
        System.out.println(length * breadth);

    }

    void area(double radius) {

        System.out.print("AREA OF CIRCLE IS : ");
        System.out.println(Math.PI * radius * radius);

    }
}

public class Ques7 {
    public static void main(String[] args) {
        AreaCalculator areas = new AreaCalculator();

        areas.area(10);
        areas.area(20, 12);
        areas.area(12.6);
    }
}
