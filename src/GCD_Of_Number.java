public class GCD_Of_Number {
    // GCD - Greatest Common Divisor
    static int getGCD(int a, int b) {
        // (a,b) = (b, a%b) -> This is euclidean formula for finding gcd
        // Ye formula aaya hai -- 18 = 2*3*3
        //                         12 = 2*3*2 , gcd = 2*3 = 6
        while (b != 0) {
            //
            int oldValueOfb = b;
            b = a%b;
            a = oldValueOfb;
        }
        int ans = a;
        return ans;
    }

    // LCM of a number
    static int getLCM(int a, int b) {
        int gcd = getGCD(a,b);
        int prod = a*b;
        int lcm = prod/gcd;

        return lcm;
    }

    // Find Armstrong Number -> abc = a*a*a + b*b*b + c*c*c
    static boolean getArmstrongNumber(int num) {
        int sum = 0; // its for storing sum
        int originalNum = num; // its for checking
        while (num != 0) {
            int digit = num % 10;
            int cubeOfDigit = digit*digit*digit;
            sum = sum + cubeOfDigit;
            // digit remove from num
            num = num / 10;
        }
        if (sum == originalNum) {
            return true;
        }
        else {
            return false;
        }
    }

    // check the perfect Number
    static boolean checkPerfectNumber(int num) {
        int sum = 1;

        for(int i = 2; i*i <= num; i++ ) {
            if(num % i == 0) {
                // i ne num ko perfectly divide kar diya
                // toh ab factor pair kya banega
                // first factor = i
                //2nd factor = num/i
                int firstFactor = i;
                int secondFactor = num/i;
                sum = sum + firstFactor + secondFactor;
            }
        }
        if(sum == num ) {
            return true;
        }
        else {
            return false;
        }

    }





    public static void main() {
        // for Greatest Common Divisor
        System.out.println(getGCD(18,12));
        // print for LCM
        System.out.println(getLCM(18,12));
        // print for Armstrong Number
        System.out.println(getArmstrongNumber(153));
        // check perfect number
        System.out.println(checkPerfectNumber(6));

    }
}
