package operators.arrithmetic;



public class Ques2 {
    public static void main(String[] args) {
        int salary = 30000;
        int bonus = 5000;
        int transport = 2000;

        int total = salary + bonus + transport;
        int monthly = total / 12;

        System.out.println("Total Salary : " + total);
        System.out.println("Monthly Salary  :  " + monthly);
    }
}
