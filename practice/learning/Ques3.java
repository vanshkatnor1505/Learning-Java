// find indexes of all two elements of array whose sum is equal to given num

package practice.learning;

public class Ques3 {
    public static void main(String[] args) {
        int arr[] = {2, 6, 7, 8, 3, 5, 4};
        int sum = 9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(i + " " + j);
                }
            }
        }

    }
}
