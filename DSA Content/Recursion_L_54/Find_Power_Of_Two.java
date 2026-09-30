package Recursion_L_54;

public class Find_Power_Of_Two {

    static long powerOfTwo(int nums) {
        if(nums == 0) {
            return 1;
        }

        // recursive fun , and processing part is 2* wala part kahlata hai
        long ans = 2 * powerOfTwo(nums-1); // yahan par condition se pahle isi function ka naam likhna hai
        return ans;

    }

    static void main() {
        long nums = 32;
        powerOfTwo((int) nums);
        System.out.println(powerOfTwo((int) nums));
    }


}
