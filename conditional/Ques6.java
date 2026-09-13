// Write a menu-driven Java program that uses a switch statement to perform 
// addition, subtraction, multiplication, division and modulus 
// on two numbers entered by the user. 
// Use a loop so that the user can repeat the operation until they choose to exit.


package conditional;
import java.util.*;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int result = 0;

        do{

            System.out.println("=========MENU=========");
            System.out.println("| 1.    Addition     |");
            System.out.println("| 2.   Subtraction   |");
            System.out.println("| 3.  Multiplication |");
            System.out.println("| 4.    Division     |");
            System.out.println("| 5.     Modulus     |");
            System.out.println("| 6.      exit       |");
            System.out.println("======================");

            System.out.print("ENTER YOUR CHOICE : ");
            choice = sc.nextInt();



            if (1 <= choice && choice <= 5) {
                System.out.print("ENTER FIRST NUMBER : ");
                int num1 = sc.nextInt();
                
                System.out.print("ENTER SECOND NUMBER :");
                int num2 = sc.nextInt();

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("ADDITION IS : " + result);
                        break;
                    
                    case 2:
                        System.out.println("twoooo");
                        break;

                    case 3:
                        System.out.println("threeeee");
                        break;

                    case 4:
                        System.out.println("fourrrrrr");
                        break;

                    case 5:
                        System.out.println("fiveeeee");

                }


            }

            else if (choice == 6) {
                System.out.println("EXITING THE CODE");
            }
            else{
                System.out.println("Invailid choice");
            }
        }while(choice != 6);

        sc.close();
    }
}
