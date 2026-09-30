package String_Que;

public class Remove_All_Occurance_of_Substring {
    // input abababcd : output - cd, removed occurance = "ab"

    static String removeOccurances(String s, String part) {
        // kab tak same 2 steps karenge
        // jb tak part exist karta h s string me

        while(s.contains(part)) {
            // search part inside s
            int index = s.indexOf(part); // this is inbuilt method in java
            //create a new string by merging the left and right part
            // bound substring inside s string
            s = s.substring(0, index) + s.substring(index + part.length());

        }
        return s;

    }

    static void main(String[] args) {
        String s = "recoabcabcabcrd";
        String part = "abc";

        System.out.println(removeOccurances(s, part));

    }


    // its space complexity is : O(n^2 * m)






}
