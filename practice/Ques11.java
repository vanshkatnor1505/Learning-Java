package practice;
// Problem statement
// Build a Java program that manages university students and their course registrations.

// You need to create two classes:
// 1. Student
// 2. Course

// Part 1: Create the Course class
// Instance variables
// courseId	String
// courseName	String
// creditHours	int
// enrolledStudents	int

// Constructors
// 1. No-argument constructor:
//    - courseId = "NA"
//    - courseName = "Not Assigned"
//    - creditHours = 0
//    - enrolledStudents = 0

// 2. Parameterized constructor:
//    - Accept all course details except enrolledStudents.
//    - Initialize enrolledStudents to 0.

// Methods
// - enrollStudent() — increase enrolledStudents by 1.
// - displayCourseDetails() — display all course information.


// Part 2: Create the Student class

// Instance variables
// studentName	String
// rollNumber	int
// cgpa	double
// registeredCourses	int

// Constructors
// 1. No-argument constructor:
//    - studentName = "Unknown"
//    - rollNumber = 0
//    - cgpa = 0.0
//    - registeredCourses = 0

// 2. Parameterized constructor:
//    - Accept studentName, rollNumber and cgpa.
//    - Initialize registeredCourses to 0.

// Methods
// 1. Register a course
// void registerCourse(Course course)

// Requirements:
// - Register the given course.
// - Increase the student's registeredCourses.
// - Increase the course's enrolledStudents.


// 2. Update CGPA — method overloading

// Create two methods:
// void updateCGPA(double newCGPA)
// void updateCGPA(double semesterPoints, int totalCredits)


// The second method should calculate:
// \[
// CGPA = \frac{semesterPoints}{totalCredits}
// \]

// Reject invalid values, such as negative CGPA or zero credits.

// 3. Display student details
// void displayStudentDetails()


// Display all student information.
// Part 3: Main method — test your implementation
// Create the following objects:
// Course c1 = new Course("CS101", "Java Programming", 4);
// Course c2 = new Course("CS102", "Data Structures", 3);

// Student s1 = new Student("Vansh", 101, 9.2);
// Student s2 = new Student("Rahul", 102, 8.5);


// Perform these operations:
// 1. Register s1 in both courses.
// 2. Register s2 in Java Programming.
// 3. Update s1's CGPA using updateCGPA(9.5).
// 4. Update s2's CGPA using updateCGPA(36.0, 4).
// 5. Display both students' details.
// 6. Display both courses' details.


class Course {

    String courseId;
    String courseName;
    int creditHours;
    int enrolledStudents;

    // No-argument constructor
    Course() {
        this.courseId = "NA";
        this.courseName = "Not Assigned";
        this.creditHours = 0;
        this.enrolledStudents = 0;
    }

    // Parameterized constructor
    Course(String ci, String cn, int ch) {
        this.courseId = ci;
        this.courseName = cn;
        this.creditHours = ch;
        this.enrolledStudents = 0;
    }

    // Enroll a student
    int enrollStudent() {
        enrolledStudents++;
        return enrolledStudents;
    }

    // Display course details
    void displayCourseDetails() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Enrolled Students: " + enrolledStudents);
    }
}


class Student {

    String studentName;
    int rollNumber;
    double cgpa;
    int registeredCourses;

    // No-argument constructor
    Student() {
        this.studentName = "Unknown";
        this.rollNumber = 0;
        this.cgpa = 0.0;
        this.registeredCourses = 0;
    }

    // Parameterized constructor
    Student(String sn, int rn, double cg) {
        this.studentName = sn;
        this.rollNumber = rn;
        this.cgpa = cg;
        this.registeredCourses = 0;
    }

    // Register a course
    void registerCourse(Course course) {

        if (course == null) {
            System.out.println("Invalid course!");
            return;
        }

        registeredCourses++;
        course.enrollStudent();

        System.out.println(studentName +
                " successfully registered for " +
                course.courseName);
    }

    // Method overloading: update CGPA directly
    void updateCGPA(double newCGPA) {

        if (newCGPA >= 0 && newCGPA <= 10) {
            cgpa = newCGPA;
        } else {
            System.out.println("Invalid CGPA!");
        }
    }

    // Method overloading: calculate CGPA
    void updateCGPA(double semesterPoints, int totalCredits) {

        if (semesterPoints < 0 || semesterPoints > totalCredits * 10
                || totalCredits <= 0) {

            System.out.println("Invalid semester points or credits!");
            return;
        }

        cgpa = semesterPoints / totalCredits;
    }

    // Display student details
    void displayStudentDetails() {

        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Registered Courses: " + registeredCourses);
    }
}


public class Ques11 {

    public static void main(String[] args) {

        // Creating course objects
        Course c1 = new Course("CS101", "Java Programming", 4);
        Course c2 = new Course("CS102", "Data Structures", 3);

        // Creating student objects
        Student s1 = new Student("Vansh", 101, 9.2);
        Student s2 = new Student("Rahul", 102, 8.5);

        // Course registration
        s1.registerCourse(c1);
        s1.registerCourse(c2);

        s2.registerCourse(c1);

        // Updating CGPA using overloaded methods
        s1.updateCGPA(9.5);
        s2.updateCGPA(36.0, 4);

        // Display students
        System.out.println("\n===== STUDENT DETAILS =====");

        s1.displayStudentDetails();

        System.out.println();

        s2.displayStudentDetails();

        // Display courses
        System.out.println("\n===== COURSE DETAILS =====");

        c1.displayCourseDetails();

        System.out.println();

        c2.displayCourseDetails();
    }
}
