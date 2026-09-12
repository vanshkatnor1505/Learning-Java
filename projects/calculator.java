package projects;

import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code;

        System.out.println("================================");
        System.out.println("|      DIGITAL V CALCULATOR    |");
        System.out.println("================================");
        System.out.println("-------------------------------");
        System.out.println("|  OPERATION     |    CODE     |");
        System.out.println("-------------------------------");
        System.out.println("| ADDITION       | +, add, sum |");
        System.out.println("| SUBTRACTION    |   minus, -  |");
        System.out.println("| MULTIPLICATION | *, multiply |");
        System.out.println("| DIVISION       |  /, divide  |");
        System.out.println("| REMAINDER      |      %      |");
        System.out.println("| NATURAL LOG    |     ln      |");
        System.out.println("| LOG BASE 10    |     log     |");
        System.out.println("| SQUARE ROOT    |     sqrt    |");
        System.out.println("| FACTORIAL      |     fac     |");
        System.out.println("| AREA OF CIRCLE |  areacircle |");
        System.out.println("| AREA OF SQUARE |  areasquare |");
        System.out.println("| LOG BASE 2     |    log2     |");
        System.out.println("| SINE           |     sin     |");
        System.out.println("| COSINE         |     cos     |");
        System.out.println("| TANGENT        |     tan     |");
        System.out.println("|   EXIT         |    exit     |");
        System.out.println("-------------------------------");

        do {

            System.out.print("ENTER THE CODE TO PERFORM OPERATION : ");
            code = sc.nextLine();

            if ((code.equals("+")) || (code.equals("add")) || (code.equals("sum"))) {

                System.out.print("ENTER THE FIRST NUMBER TO PERFORM ADDITION : ");
                double firstnum = sc.nextFloat();
                sc.nextLine();

                System.out.print("ENTER THE SECOND NUMBER TO PERFORM ADDITION : ");
                double secondnum = sc.nextFloat();
                sc.nextLine();

                double result = firstnum + secondnum;

                System.out.println("THANKYOU FOR USING MY CALCULATOR");
                System.out.println("THE ADDITION OF TWO NUMBERS IS : " + result);

            }

            else if (code.equals("-") || (code.equals("minus"))) {

                System.out.print("ENTER THE FIRST NUMBER TO PERFORM SUBTRACTION : ");
                double firstnum = sc.nextInt();
                sc.nextLine();

                System.out.print("ENTER THE SECOND NUMBER TO PERFORM SUBTRACTION : ");
                double secondnum = sc.nextInt();
                sc.nextLine();

                double result = firstnum - secondnum;

                System.out.println("THANKYOU FOR USING MY CALCULATOR");
                System.out.println("THE SUBTRACTION OF TWO NUMBERS IS : " + result);

            }

            else if (code.equals("*") || (code.equals("multiply"))) {

                System.out.print("ENTER THE FIRST NUMBER TO PERFORM MULTIPLICATION : ");
                double firstnum = sc.nextInt();
                sc.nextLine();

                System.out.print("ENTER THE SECOND NUMBER TO PERFORM MULTIPLICATION : ");
                double secondnum = sc.nextInt();
                sc.nextLine();

                double result = firstnum * secondnum;

                System.out.println("THANKYOU FOR USING MY CLACULATOR");
                System.out.println("THE MULTIPLICATION OF TWO NUMBERS IS : " + result);

            }

            else if (code.equals("/") || (code.equals("divide"))) {

                System.out.print("ENTER THE FIRST NUMBER TO PERFORM DIVISION : ");
                double firstnum = sc.nextInt();
                sc.nextLine();

                System.out.print("ENTER THE SECOND NUMBER TO PERFORM DIVISION : ");
                double secondnum = sc.nextInt();
                sc.nextLine();

                if (secondnum == 0) {
                    System.out.println("DENOMENATOR CANNOT BE ZERO");
                    System.out.println("THANKYOU FOR USING MY CLACULATOR");
                    System.out.println("NEXT TIME BE CAREFULL");
                } else {
                    double result = firstnum / secondnum;

                    System.out.println("THANKYOU FOR USING MY CLACULATOR");
                    System.out.println("THE DIVISION OF TWO NUMBERS IS : " + result);
                }

            }

            else if (code.equals("%")) {

                System.out.print("ENTER THE FIRST NUMBER TO CALCULATE REMAINDER : ");
                double firstnum = sc.nextInt();
                sc.nextLine();

                System.out.print("ENTER THE SECOND NUMBER TO CALCULATE REMAINDER : ");
                double secondnum = sc.nextInt();
                sc.nextLine();

                if (secondnum == 0) {
                    System.out.println("DENOMENATOR CANNOT BE ZERO");
                    System.out.println("THANKYOU FOR USING MY CLACULATOR");
                    System.out.println("NEXT TIME BE CAREFULL");
                } else {
                    double result = firstnum % secondnum;

                    System.out.println("THANKYOU FOR USING MY CLACULATOR");
                    System.out.println("THE REMAINDER WHEN " + firstnum + " DIVIDED BY " + secondnum + "IS " + result);

                }

            }

            else if (code.equals("ln")) {

                System.out.print("ENTER NUMBER TO FIND NATURAL LOG OF : ");
                double num = sc.nextInt();
                sc.nextLine();

                double result = Math.log(num);

                System.out.println("THANKYOU FOR USING MY CLACULATOR");
                System.out.println("THE NATURAL LOG OF " + num + " IS : " + result);

            }

            else if (code.equals("log")) {

                System.out.print("ENTER NUMBER TO FIND LOG OF : ");
                double num = sc.nextInt();
                sc.nextLine();

                double result = Math.log10(num);

                System.out.println("THANKYOU FOR USING MY CLACULATOR");
                System.out.println("THE  LOG OF " + num + " IS : " + result);

            }

            else if (code.equals("log2")) {

                System.out.print("ENTER NUMBER TO FIND LOG BASE 2 OF : ");
                double num = sc.nextInt();
                sc.nextLine();

                double result = Math.log(num) / Math.log(2);

                System.out.println("THANKYOU FOR USING MY CLACULATOR");
                System.out.println("THE LOG BASE 2 OF " + num + " IS : " + result);

            }

            else if (code.equals("sqrt")) {

                System.out.print("ENTER NUMBER TO FIND SQUARE ROOT OF : ");
                double num = sc.nextInt();
                sc.nextLine();

                double result = Math.sqrt(num);

                System.out.println("THANKYOU FOR USING MY CLACULATOR");
                System.out.println("THE SQUARE ROOT OF " + num + " IS : " + result);

            }

            else if (code.equals("fac")) {

                System.out.print("ENTER NUMBER TO FIND FACTORIAL OF : ");
                int num = sc.nextInt();
                sc.nextLine();

                int fac = 1;

                if (num < 0) {
                    System.out.println("FACTORIAL OF NEGATIVE IS NOT POSSIBLE TO CALCULATE");
                } else if (num == 1 || num == 0) {
                    fac = 1;
                } else {
                    for (int i = 1; i <= (num); i++) {
                        fac = fac * i;
                    }
                }

                System.out.println("THANKYOU FOR USING MY CLACULATOR");
                System.out.println("THE FACTORIAL OF " + num + " IS : " + fac);

            }

            else if (code.equals("areacircle")) {

                System.out.print("ENTER RADIUS TO FIND AREA OF CIRCLE : ");
                double radius = sc.nextDouble();
                sc.nextLine();

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

            }

            else if (code.equals("areasquare")) {

                System.out.print("ENTER THE SIDE OF THE SQUARE : ");
                double side = sc.nextDouble();
                sc.nextLine();

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

            else if (code.equals("sin")) {

                System.out.print("ENTER ANGLE IN DEGREES TO FIND SINE : ");
                double angle = sc.nextDouble();
                sc.nextLine();

                double radians = Math.toRadians(angle);
                double result = Math.sin(radians);

                System.out.println("THANK YOU FOR USING MY CALCULATOR");
                System.out.println("THE SINE OF " + angle + "° IS : " + result);

            }

            else if (code.equals("cos")) {

                System.out.print("ENTER ANGLE IN DEGREES TO FIND COSINE : ");
                double angle = sc.nextDouble();
                sc.nextLine();

                double radians = Math.toRadians(angle);
                double result = Math.cos(radians);

                System.out.println("THANK YOU FOR USING MY CALCULATOR");
                System.out.println("THE COSINE OF " + angle + "° IS : " + result);

            }

            
            else if (code.equals("tan")) {

                System.out.print("ENTER ANGLE IN DEGREES TO FIND TANGENT : ");
                double angle = sc.nextDouble();
                sc.nextLine();

                double radians = Math.toRadians(angle);
                double result = Math.tan(radians);

                System.out.println("THANK YOU FOR USING MY CALCULATOR");
                System.out.println("THE TANGENT OF " + angle + "° IS : " + result);

            }

            else if (code.equals("cot")) {

                System.out.print("ENTER ANGLE IN DEGREES TO FIND COT : ");
                double angle = sc.nextDouble();
                sc.nextLine();

                double radians = Math.toRadians(angle);
                double result = 1/ Math.tan(radians);

                System.out.println("THANK YOU FOR USING MY CALCULATOR");
                System.out.println("THE COT OF " + angle + "° IS : " + result);

            }

            else if (code.equals("exit")) {
                System.out.println("THANK YOU FOR USING CALCULATOR");
                System.out.println("CALCULATOR CLOSED BY USER");

            } else {
                System.out.println("HEY MATE BE CAREFULL ABOUT WHAT YOU ARE WRITING ");
                System.out.println("{ " + code + " } IS OUT OF THIS CALCULATOR'S UNIVERSE ");
            }

        } while (!code.equals("exit"));

        sc.close();

    }
}
