package ArrayQue;

public class Array_5 {
    // find -ve sum and +ve sum

    static int[] findSum(int[] arr) {
        int positiveSum = 0;
        int negativeSum = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > 0) {
                //+ve num
                positiveSum = positiveSum + arr[i];
            }
            else {
                // -ve sum
                negativeSum = negativeSum + arr[i];

            }
        }
        int[] ans = {positiveSum, negativeSum};
        return ans;

    }


    static void main() {
        int[] arr = {1, -3, 3, -10, -4};
        int[] ans= findSum(arr);
        System.out.println("Positive sum is : " + ans[0]);
        System.out.println("Negative sum is : " + ans[1]);


    }

    // tc - O(1), sc - (1)

}
