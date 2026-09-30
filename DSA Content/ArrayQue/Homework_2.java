package ArrayQue;

public class Homework_2 {
    // print Array Intersection element
    static void IntersectionEl(int[] arr, int[] brr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<brr.length; j++) {
                if (arr[i] == brr[j]) {
                    // agar dono ka element barabar ho to ek ka element print kar do
                    System.out.print(arr[i] + " ");
                    // break statement compiler ko aage jaane se rokta hai
                    break;
                }
            }
        }
        // void me kuchh return nahi karna parta hai

    }

    static void main() {
        int[] arr = {2,3,5,8,6,9,43,62,12};
        int[] brr = {3,2,10,8,5,12,11,32};
        // agar class/if ke anadar me hi print kar diya hai to sirf method call kar lo
        IntersectionEl(arr,brr);
    }
}
