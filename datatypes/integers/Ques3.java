// ========== Student Report ==========
// Name         : Vansh
// Roll Number  : 25

// Math         : 92
// Science      : 88
// English      : 95
// Computer     : 97
// History      : 90

// Total Marks  : 462
// ====================================


package datatypes.integers;

public class Ques3 {
    public static void main(String[] args) {
        String name = "Vansh";
        int rollno = 25;

        int math = 99;
        int science = 88;
        int english = 95;
        int computer = 97;
        int history = 90;

        int total = math + science + english + computer + history;

        System.out.println("========== Student Report ==========");
        System.out.println("Name         : " + name);
        System.out.println("Roll Number  : " + rollno);
        System.out.println();
        System.out.println("Math         : " + math);
        System.out.println("Science      : " + science);
        System.out.println("English      : " + english);
        System.out.println("Computer     : " + computer);
        System.out.println("History      : " + history);
        System.out.println();
        System.out.println("Total Marks  : " + total);
        System.out.println("Data Validation : PASS");
        System.out.println("====================================");
    }
}
