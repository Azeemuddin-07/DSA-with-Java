package ArrayQue;

public class Array_4 {
    static  int findMaximum(int[] arr) {
        int Max = arr[0]; // maine maan liye ki pahla ele hi sabse bara hai
        for(int i=0; i<arr.length; i++){
            if(arr [i] > Max ) {// check karo
                Max = arr[i]; // agar bara nahi hai to Max me store karo current bara value ki
            }
        }
        return Max; // return karo
    }

    // Math.max() method is used for find max. replacer of for loop.

    static void main() {
        int[] arr = {1,4,6,3,7,12,340};
        System.out.println(findMaximum(arr));

    }

    // tc - o(n) , sc - o(1);


}
