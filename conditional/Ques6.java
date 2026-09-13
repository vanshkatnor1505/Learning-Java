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
        double result, num1, num2;

        do {

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
                num1 = sc.nextDouble();

                System.out.print("ENTER SECOND NUMBER :");
                num2 = sc.nextDouble();

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("ADDITION IS : " + result);
                        System.out.println("Thanks for using calculator");
                        break;

                    case 2:
                        result = num1 - num2;
                        System.out.println("SUBTRACTION IS : " + result);
                        System.out.println("Thanks for using calculator");
                        break;

                    case 3:
                        result = num1 * num2;
                        System.out.println("MULTIPLICATION IS : " + result);
                        System.out.println("Thanks for using calculator");
                        break;

                    case 4:
                        result = num1 / num2;
                        System.out.println("DIVISION IS : " + result);
                        System.out.println("Thanks for using calculator");
                        break;

                    case 5:
                        result = num1 % num2;
                        System.out.println("MODULUS IS : " + result);
                        System.out.println("Thanks for using calculator");

                }

            }

            else if (choice == 6) {
                System.out.println("Thanks for using calculator");
                System.out.println("EXITING THE CODE");

            } else {
                System.out.println("Invailid choice");
            }
        } while (choice != 6);

        sc.close();
    }
}
