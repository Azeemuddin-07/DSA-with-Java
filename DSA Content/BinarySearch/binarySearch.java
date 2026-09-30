package BinarySearch;

public class binarySearch {
    static int Binarysearch(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid = start + (end - start) / 2;

        while(start <= end) {
            // compare target with midValue
            if(arr[mid] == target) {
                // target found
                return mid;
            }
            else if(arr[mid] > target) {
                // go to the right
                end = mid - 1;
            }
            else {
                // target < arr[mid]
                start = mid + 1;

            }
            // update mid
            mid = start + (end - start) / 2;
        }
        // agar target nahi mila to -1 return kar do
        return -1;

    }

    static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,21};
        int Index = Binarysearch(arr,9);
        System.out.println("Target ka index hai : " + Index);
    }

}
