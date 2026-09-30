package Recursion_L_54;

public class Fibonacci_Number {
    // fibonacci number :0 1 1 2 3 5 8 13 ...

    static int fib(int n) {
        // base case
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;

        // recursive relation

        int ans = fib(n-1) + fib(n-2);
        return ans;


    }

    static void main(String[] args) {
        int n = 15;
        System.out.println(fib(8));
    }


}
