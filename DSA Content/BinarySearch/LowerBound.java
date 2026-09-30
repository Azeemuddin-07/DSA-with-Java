package BinarySearch;

public class LowerBound {
    // Lower Bound of occurance - lowest index of repeated element in sorted array
    // Binary search
    static int getLowerBound(int[] arr, int target) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        while(s <= e) {
            int mid = s+(e-s) / 2;

            if(arr[mid] >= target) {
                // ans store
                ans = mid;
                e = mid-1;
            }
            else {
                // arr[mid]<target
                // shift right
                s = mid+1;
            }
        }
        return ans;
    }


    static void main(String[] args){
        int[] arr = {2,3,4,4,4,4,6,7};
        int target = 4;
        int ans = getLowerBound(arr, target);
        System.out.println("printing lower Bound Index : " + ans);
    }
}
