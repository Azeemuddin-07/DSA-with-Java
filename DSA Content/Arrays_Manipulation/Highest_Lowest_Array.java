package Arrays_Manipulation;
import java.util.HashMap;

public class Highest_Lowest_Array {
    static int[] getHighestLowestFrequency(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        // insert data
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        // HashMap is ready
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;
        for(int key : freq.keySet()) {
            int currentKey = key;
            int currentFreq = freq.get(key);
            if(currentFreq > highestFreq) {
                //highest ko updae karna chahiye
                highestFreq = currentFreq;
                highestNum = currentKey;
            }
        }
        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for(int key : freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if(currentFreq < lowestFreq) {
                // its time to update
                lowestFreq = currentFreq;
                lowestNum = currentKey;
            }

        }
        int[] ans = {highestNum, lowestNum};
        return ans;
    }



    static void main() {
        int[] arr = {1,3,3,3,5,6,6,6,6,6,6,7,4,7,3,9};
        int[] ans = getHighestLowestFrequency(arr);
        System.out.println("Jyada baar aane wala Num : " + ans[0] + " ");
        System.out.println("kam baar aane wala Num : " + ans[1] + " ");

    }


}
