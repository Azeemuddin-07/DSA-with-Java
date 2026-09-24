public class BasicMaths {

    static void printDigit(int num) {
        // agar mere num=0 , to mai ruk jaunga
        // agar mere num!=0 , tab tak mai processing karta rahunga
        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            // last digit remove
            num = num/10;
        }
    }
    // count digit
    static int countDigits(int num) {
        int count = 0;
        while(num!=0) {
            int digit = num % 10;
            count++;
            //remove last digit
            num = num/10;
        }
        return count;
    }

    // sum of all digit in a given number
    static int sumOfDigits(int num) {
        int sum = 0;
        while(num!=0) {
            int digit = num % 10;
            sum = sum + digit;
            // last digit remove
            num = num/10;
        }
        return sum;
    }

    //reverse the number
    static int reverseNum(int num) {
        int revNum = 0;
        //ans = ans*10 + currentDigit
        while(num != 0) {
            int digit = num % 10;
            //reverse num calculate as per formula
            revNum = revNum*10 + digit;
            // last remove digit
            num = num / 10;
        }
        return revNum;

    }

    // palindrome number
    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = reverseNum(num);
        if(originalNum == reversedNum) {
            System.out.println("It is palindrome Number");
            return true;
        }
        else {
            System.out.println("It is not palindrome Number");
            return false;
        }
    }

    // find prime number
    static boolean isPrimeOrNot(int num) {
        // its time coplexity square root of n , means this is optimized soln.
        for(int i = 2; i*i <= num; i++ ) {
            if(num%i == 0) {
                // not a prime number
                return false;

            }
        }
//        for(int i = 2; i <= num-1; i++ ) {
        // its time complexity is n.
//            if(num%i == 0) {
//                // not a prime number
//                return false;
//
//            }
//        }
        // yahan tabhi pahunch paoge, jab loop se bahar nikloge
        // loop se tabhi bahar nikloge , jab kabhi
        // bhi remainder 0 nahi aaya
        // iska matlab its a prime number
        return true;
    }


    // method/function calling in main method
    public static void main() {
        // given input
        int num = 1234321;
        printDigit(num);

        //print countDigit
        int ans = countDigits(num);
        System.out.println("Total Digit is : "+ans);

        // print sum of digit
        int sum = sumOfDigits(num);
        System.out.println("Total sum of digit is : " + sum);

        //reverse number print
        int revNum = reverseNum(num);
        System.out.println(revNum);

        // palindrome print
        boolean ans5 = isPalindrome(num);
        System.out.println(ans5);

        // Prime number
        System.out.println(isPrimeOrNot(num));

    }
}
