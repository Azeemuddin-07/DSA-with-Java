package String_Que;

public class Permutation_in_String {
    static boolean compareFreq(int[] count1, int[] count2) {
        for(int i=0; i<26; i++) {
            if(count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }



    public boolean checkInclusion(String s1, String s2) {
        // algo wise
        //basic check -> whether s1 k charavters are present in s2 or not
        // s1 ka table ready kr lete hai
        //s2 ki first window ko process kr lete h
        //s2 ki remaining window ko process kr lete hai

        if(s1.length() > s2.length()) {
            return false;
        }

        //s1 ka freq table create karte hai
        int count1[] = new int[26];
        for(int i=0; i<s1.length(); i++) {
            char ch = s1.charAt(i);
            int index = ch - 'a';
            count1[index]++;
        }

        // s2 ka freq table create karte hai
        int i = 0;
        int windowLength = s1.length();
        int count2[] = new int[26];
        //first wind
        for(i=0; i<windowLength; i++) {
            char ch = s2.charAt(i);
            int index = ch - 'a';
            count2[index]++;
        }

        if(compareFreq(count1, count2) == true) {
            return true;
        }
        else {
            //both the freq table are not matching
            // process remaining windows
            while(i < s2.length()) {
                // new window pe move kr rahe ho to new charactor ko
                // freq table me add karo,
                char newChar = s2.charAt(i);
                int newCharIndex = newChar - 'a';
                count2[newCharIndex]++;

                // old charactor ke entry ko table se remove karo ,
                int oldCharIndex = i - windowLength;
                char oldChar = s2.charAt(oldCharIndex);
                int freqTableIndexOfOldChar = oldChar - 'a';
                count2[freqTableIndexOfOldChar]--;

                // aapke pass updated table aa gya hai new window k liye
                // isko compare karo s1 k reernce table se
                if(compareFreq(count1, count2) == true)
                    return true;
                // yahan pe mai hamesha ek galati karunga
                i++;

            }
        }
        return false;
    }
}
