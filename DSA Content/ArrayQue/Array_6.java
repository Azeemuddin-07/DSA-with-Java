package ArrayQue;

public class Array_6 {
    // Count the numeber of 0 and 1

    static int[] getZeroOneCount(int[] arr) {
        int oneCount = 0;
        int zeroCount = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 1) {
                oneCount++;
            }
            else if(arr[i] == 0) {
                zeroCount++;
            }
        }
        int[] ans = {oneCount, zeroCount};
        return ans;

    }

    static void main() {
        int[] arr = {0,1,2,0,4,1,1,0};
        int[] ans = getZeroOneCount(arr);
        System.out.println("Print the count of one : " + ans[0]);
        System.out.println("Print the count of zero : " + ans[1]);


    }

    //tc - O(n) , sc - O(1)



}
