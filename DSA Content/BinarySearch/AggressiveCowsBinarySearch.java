package BinarySearch;

import java.util.Arrays;

public class AggressiveCowsBinarySearch {
    // isValid function is called predicative fun
    static boolean isValidAns(int[] stalls, int k, int minDistance) {
        // brute force approach
        int cowCount = 1;
        //first cow is placed at 0 index
        int lastPosition = stalls[0];
        for(int i=1; i<stalls.length; i++) {
            // mai cow ko tabhi place kar paunga?
            // jab current cow aur previous cow ke bich ka
            // distance >= minDistance ho
            if(stalls[i] - lastPosition >= minDistance) {
                // can place safely
                cowCount++;
                // kyunki new cow place ho chuki hai
                //iska matlab lastPosition ko update karna parega
                lastPosition = stalls[i];

                //check cowCount
                if(cowCount == k) {
                    // iska matlab aap saari cow place kar chuke hai
                    return true;
                }
            }
        }
        return false;

    }




    static int aggressiveCows(int[] stalls, int k) {
        // pahle to given array ko sort kare
        Arrays.sort(stalls);
        int n = stalls.length;

        int s = 0;
        int e = stalls[n-1] - stalls[0];
        int ans = -1;

        while(s <= e) {
            int mid = s + (e-s) /2;

            if(isValidAns(stalls,k,mid)){
                // mujhe ek possible solution mil gya
                // ans store
                ans = mid;
                //move to right
                s = mid + 1;
            }
            else {
                // mid ke saath there is no possible arrangement to cows
                // so move to left
                e = mid - 1;
            }
        }
        return ans;
    }




    static void main(String[] args) {
        int[] stalls = {1,2,8,4,9};
        int k = 3;

        int Check = aggressiveCows(stalls, 3);
        System.out.println(Check);

    }

}
