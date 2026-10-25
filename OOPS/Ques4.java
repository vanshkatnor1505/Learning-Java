// make function to find greatest element of array by making function findMax()

package OOPS;

public class Ques4 {
    int findMax(int[] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }    
    public  void main(String[] args) {
        int[] a = {2,3,4,5,6,7};

        System.out.println(findMax(a));
        
    }
}
