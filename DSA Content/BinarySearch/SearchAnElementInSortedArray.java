package BinarySearch;

public class SearchAnElementInSortedArray {
    static int getPivotEl(int[] arr ) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        while(s <= e) {
            int mid = s + (e-s)/2;

            if(arr[mid] <= arr[n-1]){
                // iska matlb hm l2 wali line pr h
                // answer to l1 wali line pr h
                // iska matlab move to l1 or left
                e = mid - 1;
            }
            else {
                // mid mera l1 pr hi h already
                // ans store
                ans = mid;
                // move to right
                s = mid + 1;
            }
        }
        return ans;
    }


    static int search(int[] nums, int target) {
        int pivotIndex = getPivotEl(nums);
        int n = nums.length;

        // if pivotIndex = -1, then array is already Sorted
//        if(pivotIndex == -1){
//            int ans = getPivotEl(nums);
//        }


        int startArray1 = 0;
        int endArray1 = pivotIndex;

        int srartArray2 = pivotIndex+1;
        return pivotIndex;
    }

}
