// find greatest among three numbers
// input given by user
// run code until user says to stop

package conditional;
import java.util.*;


public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do{
            System.out.print("ENTER FIRST NUM : ");
            int a = sc.nextInt();

            System.out.print("ENTER SECOND NUM : ");
            int b = sc.nextInt();

            System.out.print("ENTER THIRD NUM : ");
            int c = sc.nextInt();

            if (a > b && a > c) {
                System.out.println("GREATEST A  : ");
            }


            System.out.println("DO YOU WANT TO CONTINUE ?");
            System.out.print("Y/N : ");
            choice = sc.next().charAt(0);


        }while(choice == 'y' || choice == 'Y');

        sc.close();
    }
}
