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


        // part 1 : display array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }





        sc.close();
    }
}
