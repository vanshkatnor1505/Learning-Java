package practice;
// Create a class named Student with the following requirements:
// 1. Instance variables:
//    - name (String)
//    - rollNo (int)
//    - marks (double)
// 2. Create two constructors:
//    - No-argument constructor that initializes default values.
//    - Parameterized constructor that accepts all three values.
// 3. Create a method called displayDetails() that prints all student information.
// 4. Create two objects in main():
//    - One using the no-argument constructor.
//    - One using the parameterized constructor.
// 5. Call displayDetails() for both objects.


class Student {

    String name ;
    int rollNo;
    double marks;

    Student(){
        name = "vansh";
        rollNo = 23;
        marks  = 9.17;
    }

    Student(String n, int r, double m){
        name = n;
        rollNo = r;
        marks = m;

    }
    
    void display(){
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(marks);
    }
}



public class Ques9 {
    public static void main(String[] args) {
       
        Student s1 = new Student("nikhil", 12, 22.4);

        s1.display();

    }
}
