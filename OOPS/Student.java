// Create a class for Student
// with roll number, name and marks, a parameterized constructor, and a
// display()
// method. Create two objects.

package OOPS;

class Student {
    int rollNumber;
    String Name;
    double marks;

    Student(int r, String n, double m){
        rollNumber = r;
        Name = n;
        marks = m;
        
    }

    void display(){
        System.out.println(rollNumber);
        System.out.println(Name);
        System.out.println(marks);
    }
    
    public static void main(String[] args) {
        Student s1 = new Student(23, "Vansh", 23);
        Student s2 = new Student(30, "Vnsh2", 99);

        s1.display();
        s2.display();
    }
}
