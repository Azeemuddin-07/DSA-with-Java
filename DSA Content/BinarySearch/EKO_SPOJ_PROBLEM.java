package BinarySearch;

public class EKO_SPOJ_PROBLEM {
    // maximize the m = 7 amount of wood.

    // predicate function - isValidAns method
    static boolean isValidAns(int trees[], int m, int maxHeight) {
        long totalWoodCollected = 0;

        for(int i=0; i<trees.length; i++) {
            if(trees[i] > maxHeight) {
                // iska matalb sawblade overall trees height se chhota hai
                // therefore , pakka kuchh amount of wood dega katne pr
                long currentTreeWoodCollected = trees[i] - maxHeight;
                totalWoodCollected += currentTreeWoodCollected;

            }
        }
        if(totalWoodCollected >= m) {
            return true;
        }
        else{
            return false;
        }
    }





    static int getAmountOfWood (int[] trees, int m) {
        int n = trees.length;
        int s = 0;

        int maxi = -1;
        for(int i=0; i<n; i++) {
            if(trees[i] > maxi) {
                maxi = trees[i];
            }
        }
        int e = maxi;
        int ans = -1;

        while(s <= e) {
            int mid = s + (e-s)/2;  // yaha mid ek height ko defint karta hai

            if(isValidAns(trees, m, mid)) {
                //ans store
                ans = mid;
                // move to right
                s = mid + 1;

            }
            else {
                // move to left
                e = mid-1;

            }
        }
        return ans;
    }


    static void main(String[] args) {
        int[] trees = {20,15,10,17};
        int m = 7;
        int AnsOfMaxWood = getAmountOfWood(trees,7);
        System.out.println(AnsOfMaxWood);
    }



}
