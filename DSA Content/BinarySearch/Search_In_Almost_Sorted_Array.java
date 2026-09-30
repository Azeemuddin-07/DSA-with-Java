package BinarySearch;

public class Search_In_Almost_Sorted_Array {
    // almost sorted array means - two arrays are given one is sorted
    // almost sorted means ( if element is at index i in sorted array ) -
    // i-th index is prensent in another array at the index (i-1),(i) or (i+1)
    // ab target ko find karne ke liye yahi 3 index ko find karna hai target ke saath

    static int getElementInSortedArray(int[] arr, int k) {
        int n = arr.length;

        int s = 0;
        int e = n-1;

        while(s <= e) {
            int mid = s + (e-s)/2;

            if(arr[mid] == k)
                return mid;
            if(mid+1 < n && arr[mid+1] == k) // yahan p mid+1 < array ke length se chhota hona chahiye
                return mid+1;
            if(mid-1 >= 0 && arr[mid-1] == k) // mid-1 should be greater or equal to 0.
                return mid-1;

            if(k > arr[mid]) {
                // move to right
                s = mid +1; // for optimal sol ek baar mid+1 check ho chuka hia to sidha mai mid+2 se check kar skata hun
            }
            else {
                // move to left
                e = mid-1; // similarly yahan bhi mai check kar sakta hu directly mid-2 se
            }
        }
        return -1;
    }


    static void main(String[] args) {
        int[] arr = {10,3,15,9,20,17};  // this is almost sorted array.
        int k = 17;
        int Ans = getElementInSortedArray(arr,17);
        System.out.println(Ans);
    }
}