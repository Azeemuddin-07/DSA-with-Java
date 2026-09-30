package ArrayQue;
import java.util.Arrays;

public class Homework {
    // Swap alternate elements in an array

    static void SwapEl(int[] arr) {
        for(int i=0; i<arr.length-1; i+=2) { // i+=2 - taaki pairs bane
            // swapping logic
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

    }


    static void main() {
        int[] arr = {1,3,4,5,6,7};
        SwapEl(arr);
        System.out.println(Arrays.toString(arr));
    }

}
