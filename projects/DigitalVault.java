// Digital Vault — Console Data Analyzer

// The program starts with something like:

// ========================================
//         DIGITAL VAULT ANALYZER
// ========================================
// Enter number of elements: 10
// Enter 10 numbers:
// > 12
// > -4
// > 7
// > 7
// > 15
// > -2
// > 7
// > 4
// > 15
// > 9

// Then display a menu:
// ========================================
//               MAIN MENU
// ========================================
// 1. Display Array
// 2. Reverse Array
// 3. Sum & Average
// 4. Largest & Smallest
// 5. Even & Odd Analysis
// 6. Search Element
// 7. Frequency of Element
// 8. Complete Frequency Report
// 9. Second Largest / Second Smallest
// 10. Maximum Subarray
// 11. Exit
// Choose an option:


// The user can repeatedly choose options.



package projects;
import java.util.*;

public class DigitalVault {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter Number of elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " numbers :");
        for (int i = 0; i < n ; i++) {
            System.out.print(" > ");
            int element = sc.nextInt();

            arr[i] = element;

        }

        // Min menu 
        System.out.println("========= MAIN MENU =========");
        System.out.println("1.  DISPLAY ARRAY ");
        System.out.println("2.  REVERSE ARRAY ");
        System.out.println("3.  SUM and AVERAGE ");
        System.out.println("4.  LARGEST AND SMALLEST ");
        System.out.println("5.  ODD AND EVEN ANALYSIS ");
        System.out.println("6.  SEARCH ELEMENT ");
        System.out.println("7.  FREQUENCY OF ELEMENT ");
        System.out.println("8.  COMPLETE FREQUENCY REPORT ");
        System.out.println("9.  SECOND LARGEST AND SECONF SMALLEST ");
        System.out.println("10. MAXIMUM SUBARRAY  ");
        System.out.println("11. EXIT ");

        // part 1 : display array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }





        sc.close();
    }
}
