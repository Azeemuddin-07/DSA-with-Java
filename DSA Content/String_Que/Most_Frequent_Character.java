package String_Que;

public class Most_Frequent_Character{

    public static char getMaxOccuringChar(String s) {
        // create an array/
        int[] freq = new int[26];

        // traverse over string and update their frequency acoordingly
        for(int i=0; i<s.length(); i++) {
            char currChar = s.charAt(i);
            freq[currChar - 'a']++;
        }

        int maxFreq = -1;
        char ans = 'a';

        // traverse over the freq array and get the highest freq
        for(int i=0; i<26; i++) {
            if(freq[i] > maxFreq) {
                maxFreq = freq[i];
                ans = (char)(i + 'a');
            }
        }
        return ans;
    }
}
