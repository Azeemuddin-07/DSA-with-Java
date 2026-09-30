package BinarySearch;

public class UpperBound {
    // upper bound - last index of most occurence of element in sorted array

    static int getUpperBound (int[] arr , int target) {
        // init
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        while(s<=e) {
            // mid calculate
            int mid = s+(e-s)/2;
            if(arr[mid] <= target){
                // store
                s = mid + 1;

            }
            else {
                // arr[mid] > target
                // ans store
                ans = mid;
                // move left
                e = mid-1;
            }
        }
        return ans;
    }

    static void main(String[] args){
        int[] arr = {2,3,4,4,4,4,6,7};
        int target = 4;
        int ans = getUpperBound(arr, target);
        System.out.println("printing Upper Bound Index : " + ans);
    }

}
