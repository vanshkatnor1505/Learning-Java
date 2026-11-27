/*
* Develop a Java program that accepts an integer array, 
? finds the largest and smallest elements, 
? calculates the average of its elements using separate methods. 
 */

package practice.exam;

public class Ques3 {

    void largest(int arr[]) {
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element of array is : " + largest);
    }

    void average(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = sum / (arr.length - 1);
        System.out.println("Average of array elements is : " + average);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        Ques3 a1 = new Ques3();

        a1.average(arr);
        a1.largest(arr);
    }
}
