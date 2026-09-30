package BinarySearch;



public class Unbounded_Search {

    public static int get(int[] InfiniteArray, int index) {
        //simulate an infinie array by returning Integer.MAX_VALUE for out of bounds.
        if(index >= InfiniteArray.length) {
            return Integer.MAX_VALUE;
        }
        return InfiniteArray[index];
    }

    // search the target into unbounded search or infinte sorted integer array
    // in this que end of array is not defined so we couldnt find the mid
    // so at this point exponential search/doubling/galluping search come in.
    // exponential search Say - (2^n)->  i will give the specific area where to use
    // the Binary search can be used to find the target

    static int unboundedSearch(int[] InfiniteArray,int target) {
        // unbounded search logic
        if(get(InfiniteArray,0) == target) {
            return 0;
        }
        int i = 1; // 0th index wala ele check ho chuka hai
        while(get(InfiniteArray,0) <= target) {
            // unbounded concept - i = i * 2
            i = i * 2; // i ke travel ko badhane ke liye exponential wala multiply chala diya
        }
        if(get(InfiniteArray,0) > target) {
            int s = i/2; // i ke travel ko rokne ke liye 2 se divide kar diya
            int e = i; // end wala element i, target se bada hai to target obivious is se pahle hoga.

            // normal binary search
            while(s <= e) {
                int mid = s + (e-s)/2;

                if(get(InfiniteArray,mid) == target) {
                    return mid;
                }
                if(get(InfiniteArray,mid  ) > target) {
                    e = mid -1;
                }
                else {
                    s = mid + 1;
                }
            }
        }
//        else {
//            return -1;
//        }
        return -1;

    }


}
