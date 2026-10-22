// Demonstrate inheritance and method overridingusing Employee and Manager.

// Requirements from the question:
// Employee has name , salary , a parameterized constructor and display().

// Manager extends Employee, adds bonus , and overrides display().

// Call the parent's display() using super.
// Create a manager named Amit with salary 50000 and bonus 10000.


package OOPS;

class Employee {
    String name;
    double salary;

    Employee(String n, double s){
        name = n;
        salary = s;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Salary" + salary);
    }
    
}

public class Manager extends Employee {
    double bonus;

    Manager(String name, double salary, double bonus){
        super(name, salary);
        this.bonus = bonus;
    }

    @Override 
    void display() {
        super.display();
        System.out.println("Bonus : " + bonus);
    }

    public static void main(String[] args) {
        Manager m1 = new Manager("Amit", 50000, 10000);

        m1.display();
    }

    
}

