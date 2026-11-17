/*
* Write a Java program to find the largest element in an array by passing the array to a method.

* Requirements:
? Create a method findLargest(int arr[]).
? Pass an integer array from main().
? Find and return the largest element.
? Print the result in main().
 */

package arrays;

public class Ques14 {
    void findLargest(int arr[]){
        int largest = arr[0];

    
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }

    public static void main(String[] args) {
        Ques14 a1 = new Ques14();
        int arr[] = {12, 45, 23, 95, 67, 34};

        a1.findLargest(arr);
        
    }
}
