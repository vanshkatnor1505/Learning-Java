// find missing number in array of n natural numbers 

package practice.learning;
import java.util.*;

public class Ques2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 8};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            
            if (!(arr[i] == i+1)) {
                System.out.println(i+1);
                break;
            }
        }
    }
}
