package BinarySearch;

import static java.lang.Math.sqrt;

public class SquareRoot_BinarySearch_VVI {
    // find the solution of square root of number
    static long getSqrt(int x) {
        int s = 0;
        int e = x;
        long ans = -1;

        while( s <= e) {
            int mid = s+(e-s)/2;

            if(mid*mid == x) {
                // simply answer mil gya
                return mid;
            }
            else if(mid*mid > x){
                // move to the left
                e = mid-1;
            }
            else {
                // mid*mid < x
                ans = mid;
            }

        }
        return ans;
    }

    static void main(String[] args) {
        int x = (int) sqrt(82);
        System.out.println("Finding the closest digit of Square Root : " + x);
    }

}
