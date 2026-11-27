/*
* Write a Java program to create a class named Employee with data members for 
? employee ID, 
? name 
? basic salary. 
* Use constructors to initialize the details 
* display the information of at least two employee objects.
 */

package practice.exam;

class Employee {
    
    int employee_id;
    String employee_name;
    double employee_salary;

    Employee(int eid, String name, double salary) {
        employee_id = eid;
        employee_name = name;
        employee_salary = salary;
    }

    void display() {

        System.out.println("Employee ID : " + employee_id);
        System.out.println("Name        : " + employee_name);
        System.out.println("Salary      : " + employee_salary);
        System.out.println("------------------------");

    }
}

public class Ques2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(12345, "Vansh", 120000000);
        Employee e2 = new Employee(54321, "Not Vnsh", 12000);

        e1.display();
        e2.display();
    }
}
