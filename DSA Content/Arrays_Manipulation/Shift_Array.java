package Arrays_Manipulation;

public class Shift_Array {
    // shift element of array by 1 position
    static void shiftBy1(int[] arr) {
        //step 1 : store last value in temporary
        int n = arr.length;
        int temp = arr[n-1];
        //step 2 : shift all value of array
        for(int i=n-1; i>0; i--) {
            arr[i] = arr[i-1];
        }
        //step 3 : temp ki value ko 0 index pr copy
        arr[0] = temp;
    }

    static void main() {
        int[] arr = {2,3,4,5,7,8,9};
        shiftBy1(arr);
        for(int k : arr) {
            System.out.print(k + " ");
        }
    }
}
