package ArrayQue;

public class Array_3 {
    // search element in array - linear search

    static boolean findTarget(int[] arr, int target) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target) {
                return true;
            }
        }
        // agar pura array travel ho chuka hai
        // and ek baar bhi target hit nahi hua
        // matlab target is not present in array
        // return false
        return false;
    }


    static void main() {
        int[] arr = {1,2,4,6,5,8,9};
        boolean ans = findTarget(arr, 90);
        System.out.println(ans);
    }


}
