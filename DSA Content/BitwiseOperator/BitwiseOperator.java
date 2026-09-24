package BitwiseOperator;

public class BitwiseOperator {
    static void main () {

        int a = 5;
        int b = 6;

        int and = a & b; // bit value me 1,1 me 1 . baaki ke liye zero
        int or = a | b; // bit value dono me kisi ek me 1 ho to wo 1 dega
        int xor = a ^ b; // bit value me kisi same value ke liye 0 dega.

        System.out.println(and);
        System.out.println(or);
        System.out.println(xor);
        // give -6 value -> because the 2s complement of 5.
        System.out.println(~a);

        //1's compliments -> flip the value of bit.
        //   0000101
        //   1111010 , its the 1's compliments.
       // 2's compliments -> add the 1 into the 1's compliments

        // Bitwise left shift -> shift the binary value in left by 1-bit unit, and fill the gap with 0.
        // every left shift give the 2 times of multiply of its number
//        int n = 5;
//        for(int i = 0; i<=34; i++) {
//            n = n << 1;
//            System.out.println(n);
//            System.out.println();
//        }

        // Bitwise Right shift -- its give the division of 2 of every step

        int m = 50;
        for(int i=1; i<=10; i++) {
            m = m >> 1;
            System.out.println(m);
            System.out.println();
        }


        // odd even check - if n&1 == 0 to wo even hai (bcz even ke bit me last me always 0 hota hai isiliye 1&1 == 0 to even)
        int x = 6;
        if ((x&1) == 0 ) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }



        // find the number of bits in digit
        int y = 9;
        int count = 0;

        while(y != 0) {  // jab tak saare bit value zero na ho jaaye
            if((y&1) == 0){   // 0&1 = 0 , 1&1 = 1
                // mujhe ek set bit mil gya
                count++;
            }
            // right shift to remove this bit
            y = y >> 1;
        }
        System.out.println("Set bit count : " + count);


        // check the power of 2 or not - n&(n-1) == 0 to power of two hai
        int p = 12;
        if((p&(p-1)) == 0) {
            System.out.println("Aap power of 2 hai");
        }
        else {
            System.out.println("Aap power of 2 nahi hai");
        }



    }
}
