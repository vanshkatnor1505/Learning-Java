/* 
? Write a Java program to demonstrate method overloading by calculating 
* the area of a circle, 
* rectangle, 
* and triangle 

*/
package functions;

public class Ques9 {

    // Method for Area of circle
    void area(double radius){
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle : " + result);
    }

    // Method for Area of Rectangle
    void area(int length, int breadth){
        int result = length * breadth;
        System.out.println("Area of Rectangle : " + result);
    }

    // Method for Area of Triangle
    void area(double base, double height){
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle : " + result);
    }

    public static void main(String[] args) {
        Ques9 obj1 = new Ques9();

        // calling area for circle
        obj1.area(12.5);

        // calling area for rectangle
        obj1.area(10, 12);

        // calling area for Triangle
        obj1.area(5.6, 10.2);
    }
}
