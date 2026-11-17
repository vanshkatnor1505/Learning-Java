/* 
TODO: Write a Java program that finds the second-largest distinct element in an array by passing the array to a method.

* Given array:
int arr[] = {45, 12, 89, 34, 89, 67, 23, 67};


* Expected output:
? Largest element: 89
? Second largest element: 67
*/

package arrays;

public class Ques15 {

    int largest = 0;
    int secondLargest;

    void findSecondLargest(int[] arr) {
        largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                
                secondLargest = largest;
                largest = arr[i];

            }

        }
        System.out.println("LARGEST : " + largest);
        System.out.println("SECOND LARGEST : " + secondLargest);
    }

    public static void main(String[] args) {

        int arr[] = { 1,2,3,4,5,6};
        Ques15 f1 = new Ques15();

        f1.findSecondLargest(arr);
    }
}
