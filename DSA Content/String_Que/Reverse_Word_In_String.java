package String_Que;

public class Reverse_Word_In_String {
    // word wise reverse - Output = hello world -> Input = world hello.
    // string is immutable but stringBuilder is mutable/append the new char
    // stringBuilder is allowed to modification of string.


    public static String reverseWords(String s) {
        // StringBuilder create karo
        StringBuilder ans = new StringBuilder();
        int i = s.length()-1;

        while(i >= 0) {
            //remove all the trailing spaces
            while(i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            // check value of i
            if(i < 0) {
                break;
            }
            int j = i;
            // find the start index of the word
            while(j >= 0 && s.charAt(j) != ' ') {
                j--;
            }
            // jaise hi space wale index pr aaya, to ruk jayega
            // ab is word ko apne  ans me append kar dena
            ans.append(s.substring(j+1, i+1));
            // remove faltu k space where j is standing and add a space in ans
            while(j >= 0 && s.charAt(j) == ' ') {
                j--;
            }
            //  j < 0, iska matlab first word k upar tha mai -> no space needed
            // j >= 0, space needed
            if(j >= 0) {
                ans.append(' ');
            }
            // place i at last index of the remaining string
            i = j;

        }
        return ans.toString();

    }


    static void main(String[] args) {
        String s = "The sky is blue";
        System.out.println(reverseWords(s));
    }

}
