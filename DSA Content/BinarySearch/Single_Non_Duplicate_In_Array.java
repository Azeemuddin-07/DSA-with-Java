package BinarySearch;

public class Single_Non_Duplicate_In_Array {
    // find single non duplicate ele in an array where other
    // element occur twice and one element occur twice

    static int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        int s = 0;
        int e = n-1;
        int ans = -1;


        while(s <= e) {
            int mid = s+(e-s)/2;

            // single element wala case
            if(s == e) {
                ans = nums[s];
                return ans;
            }

            // non single element array
            // check whether mid element is a ans or not
            int currentValue = nums[mid];



            int prevValue = -1;
            if(mid-1 >= 0) {
                prevValue = nums[mid-1];
            }

            int nextValue = -1;
            if(mid+1 < n) {
                nextValue = nums[mid+1];
            }

            if(currentValue != prevValue && currentValue != nextValue) {
                // iska matlab currentValue hi valid answer hai
                ans = currentValue;
                return ans;
            }
            if(currentValue != prevValue && currentValue == nextValue) {
                int StartingIndexOfPair = mid;
                if((StartingIndexOfPair & 1) == 1) {
                    // StartingIndex -> odd wala case
                    // ans left me hoga
                    e = mid-1;
                }
                else {
                    // startingIndex -> even wala case
                    // ans right me hoga
                    s = mid + 1;
                }
            }
            else if(currentValue == prevValue && currentValue != nextValue) {
                int endingIndexOfPair = mid;
                if((endingIndexOfPair & 1) == 1) {
                    // ending index is odd
                    // ans right me hoga
                    s = mid+1;
                }
                else {
                    // endingIndexOfPair is even

                    // move to left
                    e = mid-1;
                }
            }
        }
        return ans;

    }


    static void main(String[] args) {
        int[] nums = {10,10,20,20,30,40,40,50,50,60,60};
        int Ans = singleNonDuplicate(nums);
        System.out.println("Printing Non Duplicate element in Array : " + Ans);

    }
}
