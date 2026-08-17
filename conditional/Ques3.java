// Number Intelligence Test

// GIVEN ::
// 5 digit positive integer 
// int number = 58372;

// RULES :: 
// Extract the five digits using the arithmetic techniques. Then determine following 

// 1. Digit ordering
// Determine whether the digits are:
// Strictly Increasing
// Example: 12345
// Strictly Decreasing
// Example: 98751
// Mixed — neither

// 2. Parity pattern
// Determine whether the number has:
// ALL EVEN digits
// ALL ODD digits
// MIXED PARITY

// 3. Digit uniqueness
// Determine whether all five digits are different

// 4. Digit sum
// Calculate the sum of all five digits.

// Final Classification
// Finally, determine the number's overall classification using these rules:
// PERFECT

// If:
// digits are strictly increasing OR strictly decreasing
// AND all digits are unique
// AND digit sum is divisible by 3

// BALANCED
// If:
// digits are mixed
// AND all digits are unique
// AND digit sum is divisible by 5

// CHAOTIC
// If:
// digits are mixed
// AND digits are not all unique
// AND digit sum is divisible by neither 3 nor 5
// ORDINARY
// Anything that doesn't satisfy the above categories.

// EXPECTED OUTPUT :::
// Number           : 58372
// Digit Order      : MIXED
// Parity           : MIXED
// Unique Digits    : YES
// Digit Sum        : 25
// Divisible by 3   : false
// Divisible by 5   : true
// Classification   : BALANCED

package conditional;

public class Ques3 {
    public static void main(String[] args) {
        int number = 58375;
        String digitOrder = "";
        String pairity = "";
        String unique = "";
        String classification = "";
    
        int first = (number/10000);
        int second = (number/1000)%10;
        int third = (number/100)%10;
        int fourth = (number/10)%10;
        int fifth = (number)%10;

        int sum = (first + second + third + fourth + fifth);

        // for digit order determination
        if (fifth > fourth && fourth > third && third > second && second > first) {
            digitOrder = "STRICTLY INCREASING";
        }
        else if (fifth < fourth && fourth < third && third < second && second < first) {
            digitOrder = "STRICTLY DECREASING";
        }
        else{
            digitOrder = "MIXED";
        }

        // for parity pattern
        if ((first % 2 == 0) && (second % 2 == 0) && (third % 2 == 0) && (fourth % 2 == 0) && (fifth % 2 == 0)) {
            pairity = "ALL EVEN";
        }
        else if ((first % 2 != 0) && (second % 2 != 0) && (third % 2 != 0) && (fourth % 2 != 0) && (fifth % 2 != 0)) {
            pairity = "ALL ODD";
        }
        else{
            pairity = "MIXED";
        }

        // to check uniqueness 
        if ((first != second && first != third && first != fourth && first != fifth) && (second != third && second != fourth && second != fifth) && (third != fourth && third != fifth) && (fourth != fifth) ) {
            unique =  "YES";
        }
        else{
            unique = "NO";
        }

        if ((digitOrder == "STRICTLY INCREASING" || digitOrder == "STRICTLY DECREASING") && (unique == "YES") && (sum % 3 == 0)) {
            classification = "PERFECT";
        }
        else if ((digitOrder == "MIXED") && (pairity == "MIXED") && (unique == "YES") && (sum % 5 == 0)) {
            classification = "BALANCED";    
        }
        else{
            classification = "CHAOTIC";
        }

        System.out.println("NUMBER         : " + number);
        System.out.println("DIGIT ORDER    : " + digitOrder);
        System.out.println("PARITY         : " + pairity);
        System.out.println("UNIQUE DIGITS  : " + unique);
        System.out.println("DIGIT SUM      : " + sum);
        if (number % 3 == 0) {
            System.out.println("DIVISIBLE BY 3 : YES");
        }else System.out.println("DIVISIBLE BY 3 : NO");
        if (number % 5 == 0) {
            System.out.println("DIVISIBLE BY 5 : YES");
        }else System.out.println("DIVISIBLE BY 5 : NO");
        System.out.println("CLASSIFICATION : " + classification);
    }
}
