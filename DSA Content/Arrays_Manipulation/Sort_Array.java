package Arrays_Manipulation;

import java.util.Arrays;

public class Sort_Array {
   // sort an Array of 0s and 1s
    public static int[] sortArray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;

        while (i < j) {
            if ( nums[i] == 1 && nums[j] == 0) {
                nums[i] = 0;
                nums[j] = 1;
            }
            if(nums[i] == 0) {
                // i ko aage le jaao
                i++;
            }
            if(nums[j] == 1) {
                // j ko peeche laao
                j--;
            }
        }
        return nums;


    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,0,1,0,1,0};
        int[] ans = sortArray(nums);
        System.out.println(Arrays.toString(ans));
    }
}
