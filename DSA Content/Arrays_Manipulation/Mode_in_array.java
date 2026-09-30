package Arrays_Manipulation;
import java.util.HashMap;

public class Mode_in_array {
    // mode - high frequency wali value ko mode nikalna kahte hai
    static int getMode(int[] arr) {
        // qki ye key-value ke pair me hai to hm hashMap ka istemaal karenge
        HashMap<Integer, Integer> freq = new HashMap<>();  // space com - o(n)

        // pure frequency pe travel aur key-value ko store karne ke liye maine for eachloop lagaya
        for(int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
//        // filhal check karne ke liye
//        for(int i : freq.keySet()) {
//            //i -> will represent key
//            System.out.println(i + " ");
//        }

        int maxFreq = -1;
        int maxFreqWaliKey = -1;

        for(int key : freq.keySet()) {
            int currentKey = key;
            int currentKeyKiFrequency =freq.get(key);

            if(currentKeyKiFrequency > maxFreq) {
                maxFreq = currentKeyKiFrequency;
                maxFreqWaliKey = currentKey;

            }
        }
        // jb loop se bahar aaoge to max freq wali key ready hai
        return maxFreqWaliKey;
    }


    static void main() {
        int[] arr = {1,2,2,3,3,3,4,5,5,5,5,5,5,5,6};
        int ans = getMode(arr);
        System.out.println(ans);
    }
}
