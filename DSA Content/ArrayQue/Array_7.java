package ArrayQue;

public class Array_7 {
    // Find first Unsorted Element in Array

    static int getFirstUnsortedEl(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            if (arr[i+1] <= arr[i]) {
                // to sabkuchh thik hai
                // kuchh karne ki jaroorat nahi hai.
                return arr[i+1];

            }

        }
        //jis case me loop se bahar aa jaunga
        return -1;

    }

    static void main() {
        int[] arr = {1,2,5,7,4,9};
        System.out.println(getFirstUnsortedEl(arr));

    }

}
