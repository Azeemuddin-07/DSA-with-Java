package BinarySearch;
// Homework - is banana hai decimal wala
// medium level hai

import static java.lang.Math.sqrt;

public class SquareRootWithDecimalPrecision {

        // find the solution of square root of number with precision

        static double getSqrt(int x) {
            int s = 0;
            int e = x;
            double ans = -1;

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

            // logic for finding the pecision value of sqaure root of number

            double factor = 1;
            int totalPrecision = 3;

            for(int round = 1; round <= totalPrecision; round++) {
                factor = factor / 10;

                for(int i=1; i<=10; i++) {
                    double newAns = ans + factor;

                    if(newAns * newAns == x) {
                        return newAns;
                    }

                    else if(newAns*newAns < x) {
                         ans = newAns;
                    }
                    else {
                        // newAns*newAns > x
                        break;
                    }

                }
                System.out.println("Is round ka ans is : " + ans);
            }
            System.out.println("is round ka ans is : " + ans);

            return ans;
        }




        // main method which is calling

        static void main(String[] args) {
            int x = ( int) sqrt(82);
            System.out.println("Finding the closest digit of Square Root : " + x);
        }

}
