package Recursion_L_54;

public class Factorial {

    //find factorial of a number

    static long factorial(int num) {
        // Base case -> matlab rukna kahan hai
        if(num == 0) {
            return 1;
        }
        // recursive relation
        long ans = num * factorial(num-1);
        return ans;
    }


    static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
    }


}
