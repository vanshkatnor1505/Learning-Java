// The Scholarship Decision Engine


// GIVEN :::: 
// int marks = 87;
// int attendance = 91;
// int familyIncome = 450000;
// int backlogs = 0;

// boolean sportsAchievement = true;
// boolean disciplinaryIssue = false;
// boolean recommendation = true;


// Your program must determine the student's scholarship category.
// 🏛️ Eligibility Rules
// A student is completely rejected if:
// they have a disciplinary issue
// OR they have more than 2 backlogs
// OR attendance is below 60

// If none of those occur, continue evaluating.

// 🥇 PREMIUM SCHOLARSHIP
// Student receives PREMIUM if:
// Academic route
// marks >= 90
// AND
// attendance >= 85
// AND
// backlogs == 0

// OR

// Achievement route
// marks >= 80
// AND
// attendance >= 80
// AND
// sportsAchievement == true
// AND
// recommendation == true
// AND
// backlogs <= 1


// 🥈 STANDARD SCHOLARSHIP
// If they don't qualify for PREMIUM, they can receive STANDARD if:
// marks >= 75
// AND
// attendance >= 75
// AND
// backlogs <= 2

// OR

// marks >= 65
// AND
// attendance >= 85
// AND
// sportsAchievement == true
// AND
// backlogs <= 1

// 🥉 NEED-BASED SCHOLARSHIP
// If they don't qualify for either PREMIUM or STANDARD:
// They can receive NEED-BASED if:
// marks >= 60
// AND
// attendance >= 70
// AND
// familyIncome < 300000
// AND
// backlogs <= 1

// ❌ OTHERWISE
// NO SCHOLARSHIP
// 💰 Scholarship Amount

// After determining the category:

// PREMIUM
// ₹100000
// STANDARD
// ₹50000
// NEED-BASED
// ₹75000
// NO SCHOLARSHIP
// ₹0


// There is a bonus:
// If the student receives PREMIUM and:
// sportsAchievement == true
// AND
// familyIncome < 500000
// then add:
// ₹25000
// to the scholarship.
// Otherwise:
// ₹0

// EXPENTED OUTPUT :::: 

// MARKS              : ...
// ATTENDANCE         : ...
// BACKLOGS           : ...
// SCHOLARSHIP        : ...
// BASE AMOUNT        : ...
// BONUS              : ...
// FINAL AMOUNT       : ...

package conditional;

public class Ques5 {
    public static void main(String[] args) {
        int marks = 87;
        int attendance = 91;
        int familyIncome = 450000;
        int backlogs = 0;
        int baseAmount = 0;
        int bonus = 0;

        boolean sportsAchievement = true;
        boolean disciplinaryIssue = false;
        boolean recommendation = true;
        boolean eligibility = true;

        String scholarshipType = "";

        if (disciplinaryIssue || backlogs > 2 || attendance < 60) {
            eligibility =  false;
        }

        if (eligibility) {
            if ((marks >= 90 && attendance >= 85 && backlogs == 0) || (marks >= 80 && attendance >= 80 && sportsAchievement && recommendation && backlogs <= 1)) {
                scholarshipType = "PREMIUM";
            }
            else if ((marks >= 75 && attendance >= 75 && backlogs <= 2) || (marks >= 65 && attendance >= 85 && sportsAchievement && backlogs <= 1)) {
                scholarshipType = "STANDARD";
            }
            else if (marks >= 60 && attendance >= 70 && familyIncome < 300000 && backlogs <= 1) {
                scholarshipType = "NEED-BASED";
            }
            else {
                scholarshipType = "NO SCHOLARSHIP";
            }
        }

        if (scholarshipType.equals("PREMIUM")) {
            baseAmount = 100000;
        }
        else if (scholarshipType.equals("STANDARD")) {
            baseAmount = 50000;
        }
        else if (scholarshipType.equals("NEED-BASED")) {
            baseAmount = 75000;
        }

        if ((scholarshipType.equals("PREMIUM")) && familyIncome < 500000 ) {
            bonus = 25000;
        }


        System.out.println("MARKS        : " + marks);
        System.out.println("ATTENDANCE   : " + attendance);
        System.out.println("BACKLOGS     : " + backlogs);
        System.out.println("SCHOLARSHIP  : " + scholarshipType);
        System.out.println("BASE AMOUNT  : " + baseAmount);
        System.out.println("BONUS        : " + bonus);
        System.out.println("FINAL AMOUNT : " + (baseAmount + bonus));
    }
}
