public class Practice_Q_String_14 {

    //LET'S PRACTICE
    //☒ 1) Print each character of the String
    //
    //☒ 2) Count length of String without length()
    //
    //3) Count vowels in a String
    //
    //4) Reverse a String
    //
    //5) Check String is a palindrome or not


    // create a method for string
    static void printString(String str) { // small bracket me argument string str define kiya hai
        int n = str.length(); // declare for i<=n
        for(int i=0; i<=n-1; i++ ) {
            char ch = str.charAt(i); //traverse of element is string array
            System.out.println(ch); // print wo karo abhi jahan tum ho
        }
    }
    // create method for find length without using length()

    static int getLengthOfString(String str) {
        char arr[] = str.toCharArray();
        int len = arr.length;
        return len;
    }

    // for vowel count in a string

    static int countVowel(String str) {
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O'|| ch=='U' ) {
                count++;
            }

        }
        return count;


    }

    // reverse the string
    static String reverseString(String str) {
        String reverse = "";
        int n = str.length();
        for(int i=n-1; i>=0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;

    }

    // palindrome
    static  boolean isPalindrome(String str) {
        String original = str;
        String reverse = reverseString(original);
        // compare
        for(int i=0; i<original.length(); i++) {
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);
                if(ch1 != ch2) {
                    return false;
                }


        }
        // loop se bahar mai tabhi aaunga
        //jab saare character match ho jayenge
        return true;
    }


    public static void main() {
        String str = "RACECAR"; // yaha variable ko define kiya gya hai
        printString(str); // ye method/function call hai
        // find length
        getLengthOfString(str);
        System.out.println(getLengthOfString(str));
        // find number of vowels
        System.out.println(countVowel(str));
        // reverse string
        System.out.println(reverseString(str));

        // palindrome
        System.out.println(isPalindrome(str));

    }
}
