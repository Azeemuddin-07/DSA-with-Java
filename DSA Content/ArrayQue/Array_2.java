package ArrayQue;

public class Array_2  {
    // multiply  of each element in the array by 10.
    static int[] multiplyBy10 (int [] arr) {
        int size = arr.length;
        int newArray[] = new int[size]; // sc - o(n), tc - o(n)

        for(int i=0; i<size; i++) {
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }
        //return udated array
        return newArray;
    }

    static void main() {
        int arr[] = {1,2,3,4,5};
        int ans[] = multiplyBy10(arr);
        System.out.println("printing ans array : ");
        for(int i : ans ) {
            System.out.println(i);
        }
    }





}
