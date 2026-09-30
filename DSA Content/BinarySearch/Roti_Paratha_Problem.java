package BinarySearch;

public class Roti_Paratha_Problem {
    //you are given n prathas tht need to be cooked by 1 cooks
    //each cooks has a rank R. which determines how quikly they can cook parathas.
    // A xook rank R takes R minuyes to cook first paratha. 2R minutes for the second
    // 3R minutes for the third . and so on...
    // each cook can only prepare one pratha at a time


    // predicate function

    static boolean isValidAns(int totalParatha, int[] cooks, int n, int timeLimit) {
        // p - no. of parthas to cook
        // n - no. of cooks

        int parathaCount = 0;
        // ek ek krke hr cook ke pass jayenge
        for(int i=0; i<cooks.length; i++) {
            int currentCookRank = cooks[i];
            int timeTaken = 0;
            int j = 1;



            // currentCookRank -> R
            //1*R, 2*R, 3*R, 4*R... so on
            // cook karna start karo
            while(timeTaken <= timeLimit) {
                if(timeTaken + j * currentCookRank <= timeLimit) {
                    // iska matlb mai ye prathas bana sakta hu
                    timeTaken = timeTaken + j * currentCookRank;
                    parathaCount++;
                    j++;
                }
                else{
                    // iska matlab currentParatha time limit k andr nahi ban sakta
                    break;
                }

            }
            // jab ye wala loop khtm hota hai , to ye ith cook jitne
            // paratha bna sakta tha unko ParathaCount me add kr chuka hota hai

//            if(parathaCount >= tatalParatha){
//                return true;
//            }
//            else{
//                return false;
//            }

        }
        if(parathaCount >= totalParatha) {
            return true;
        }
        return false;
    }



    static int minTimeToCookParathas(int p, int[] cooks, int n) {
        // p - no. of parthas to cook
        // n - no. of cooks

        int maxRank = -1;
        for(int i=0; i<cooks.length; i++) {
            if(cooks[i] > maxRank) {
                maxRank = cooks[i];
            }
        }
        int s = 0;
        // R * (n*(n-1))/2 -> R = maxRank, n->  no. of parathas
        int e = maxRank * (p*(p+1)/2);
        int ans = -1;

        while(s <= e) {
            int mid = s + (e-s)/2;

            if(isValidAns(p, cooks, n, mid)) {
                // ans store
                ans = mid;
                // left move
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }


    static void main(String[] args) {
        int[] cooks = {1, 2, 3, 4};
        int p = 10;
        int n = 4;
        int Ans = minTimeToCookParathas(p,cooks,n);
        System.out.println(Ans);
    }
}