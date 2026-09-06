package projects;

import java.util.*;

public class calculator {
    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("|      DIGITAL V CALCULATOR    |");
        System.out.println("================================");
        System.out.println("-------------------------------");
        System.out.println("|  OPERATION     |    CODE     |");
        System.out.println("-------------------------------");
        System.out.println("| ADDITION       |      +      |");
        System.out.println("| SUBTRACTION    |      -      |");
        System.out.println("| MULTIPLICATION |      *      |");
        System.out.println("| DIVISION       |      /      |");
        System.out.println("| REMAINDER      |      %      |");
        System.out.println("| NATURAL LOG    |     ln      |");
        System.out.println("| LOG BASE 10    |     log     |");
        System.out.println("| SQUARE ROOT    |     sqrt    |");
        System.out.println("| FACTORIAL      |     fac     |");
        System.out.println("| AREA OF CIRCLE |  areacircle |");
        System.out.println("| AREA OF SQUARE |  areasquare |");
        System.out.println("-------------------------------");
        // log base e to be added,
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE CODE TO PERFORM OPERATION : ");
        String code = sc.nextLine();

        if (code.equals("+")) {

            System.out.print("ENTER THE FIRST NUMBER TO PERFORM ADDITION : ");
            double firstnum = sc.nextFloat();

            System.out.print("ENTER THE SECOND NUMBER TO PERFORM ADDITION : ");
            double secondnum = sc.nextFloat();

            double result = firstnum + secondnum;

            System.out.println("THANKYOU FOR USING MY CALCULATOR");
            System.out.println("THE ADDITION OF TWO NUMBERS IS : " + result);

        } else if (code.equals("-")) {

            System.out.print("ENTER THE FIRST NUMBER TO PERFORM SUBTRACTION : ");
            double firstnum = sc.nextInt();

            System.out.print("ENTER THE SECOND NUMBER TO PERFORM SUBTRACTION : ");
            double secondnum = sc.nextInt();

            double result = firstnum - secondnum;

            System.out.println("THANKYOU FOR USING MY CALCULATOR");
            System.out.println("THE SUBTRACTION OF TWO NUMBERS IS : " + result);

        } else if (code.equals("*")) {

            System.out.print("ENTER THE FIRST NUMBER TO PERFORM MULTIPLICATION : ");
            double firstnum = sc.nextInt();

            System.out.print("ENTER THE SECOND NUMBER TO PERFORM MULTIPLICATION : ");
            double secondnum = sc.nextInt();

            double result = firstnum * secondnum;

            System.out.println("THANKYOU FOR USING MY CLACULATOR");
            System.out.println("THE MULTIPLICATION OF TWO NUMBERS IS : " + result);

        } else if (code.equals("/")) {

            System.out.print("ENTER THE FIRST NUMBER TO PERFORM DIVISION : ");
            double firstnum = sc.nextInt();

            System.out.print("ENTER THE SECOND NUMBER TO PERFORM DIVISION : ");
            double secondnum = sc.nextInt();

            if (secondnum == 0) {
                System.out.println("DENOMENATOR CANNOT BE ZERO");
                System.out.println("THANKYOU FOR USING MY CLACULATOR");
                System.out.println("NEXT TIME BE CAREFULL");
            } else {
                double result = firstnum / secondnum;

                System.out.println("THANKYOU FOR USING MY CLACULATOR");
                System.out.println("THE DIVISION OF TWO NUMBERS IS : " + result);
            }

        } else if (code.equals("%")) {

            System.out.print("ENTER THE FIRST NUMBER TO CALCULATE REMAINDER : ");
            double firstnum = sc.nextInt();

            System.out.print("ENTER THE SECOND NUMBER TO CALCULATE REMAINDER : ");
            double secondnum = sc.nextInt();

            if (secondnum == 0) {
                System.out.println("DENOMENATOR CANNOT BE ZERO");
                System.out.println("THANKYOU FOR USING MY CLACULATOR");
                System.out.println("NEXT TIME BE CAREFULL");
            } else {
                double result = firstnum * secondnum;

                System.out.println("THANKYOU FOR USING MY CLACULATOR");
                System.out.println("THE REMAINDER WHEN " + firstnum + " DIVIDED BY " + secondnum + "IS " + result);

            }

        } else if (code.equals("ln")) {

            System.out.print("ENTER NUMBER TO FIND NATURAL LOG OF : ");
            double num = sc.nextInt();

            double result = Math.log(num);

            System.out.println("THANKYOU FOR USING MY CLACULATOR");
            System.out.println("THE NATURAL LOG OF " + num + " IS : " + result);

        } else if (code.equals("log")) {

            System.out.print("ENTER NUMBER TO FIND LOG OF : ");
            double num = sc.nextInt();

            double result = Math.log10(num);

            System.out.println("THANKYOU FOR USING MY CLACULATOR");
            System.out.println("THE  LOG OF " + num + " IS : " + result);

        } else if (code.equals("sqrt")) {

            System.out.print("ENTER NUMBER TO FIND SQUARE ROOT OF : ");
            double num = sc.nextInt();

            double result = Math.sqrt(num);

            System.out.println("THANKYOU FOR USING MY CLACULATOR");
            System.out.println("THE SQUARE ROOT OF " + num + " IS : " + result);

        } else if (code.equals("fac")) {
            // factorial code

        } else if (code.equals("areacircle")) {

            System.out.print("ENTER RADIUS TO FIND AREA OF CIRCLE : ");
            double radius = sc.nextDouble();

            if (radius == 0) {
                System.out.println("THE RADIUS OF CIRCLE CANNOT BE ZERO");
                System.out.println("THANKYOU FOR USING MY CLACULATOR");
                System.out.println("BE CAREFULL ABOUT WHAT YOU WRITE");
            } else {
                double result = radius * radius * 3.14;

                System.out.println("TAKING PIE VALUE 3.14");
                System.out.println("THANKYOU FOR USING MY CLACULATOR");
                System.out.println("THE AREA OF CIRCLE WITH RADIUS " + radius + " is " + result);
            }

        } else if (code.equals("areasquare")) {

            System.out.print("ENTER THE SIDE OF THE SQUARE : ");
            double side = sc.nextDouble();

            if (side == 0) {
                System.out.println("HAVE YOU EVER SEEN SQUARE WITH SIDE ZERO ?");
                System.out.println("OFCOURSE NOT ");
                System.out.println("NOT THANKYOU FOR USING MY CLACULATOR");
            } else {
                double result = side * side;

                System.out.println("THANKYOU FOR USING MY CLACULATOR");
                System.out.println("THE AREA OF SQUARE WITH SIDE " + side + " IS " + result);

            }

        }

        sc.close();

    }
}
