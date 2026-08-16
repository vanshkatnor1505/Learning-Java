//using inputs to calculate area of circle.

package practice;
import java.util.*;

public class Ques5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER RADIUS OF CIRCLE : ");
        float radius = sc.nextFloat();

        System.out.print("ENTER VALUE OF PIE     : ");
        float pie = sc.nextFloat();
        
        sc.close();

        System.out.println("RADIUS OF CIRCLE IS " + (radius * radius * pie));
    }
}
