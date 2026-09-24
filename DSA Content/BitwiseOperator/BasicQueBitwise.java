package BitwiseOperator;

public class BasicQueBitwise {
    public static void main(String[] args) {

        // print 5&6
        System.out.println("printing 5^6 : " + (5 & 6));  // bit value or 5 and 6 then apply & operator


        // que - 2 : print 5|6
        System.out.println("printing 5^6 : " + (5 | 6));


        // que - 3 : print 5^6
        System.out.println("printing 5^6 : " + (5 ^ 6));


        // que 3 - : print ~5
        System.out.println("printing ~5 : " + (~5));


        // que - 4 : print 3<<2
        System.out.println("printing 3<<2 : " + (3 << 2));


        // que - 4 : print 16>>2
        System.out.println("printing 16>>2 : " + (16 >> 2));


        // que - 5 : check whether number is even or odd using bit operator
        int n = 10;
        if ((n & 1) == 0) {  // this condn is check for even
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }


        // que - 6 : swap number using xor
        int a = 5;
        int b = 6;

        a = a ^ b;
        b = b ^ a;
        a = a ^ b;

        System.out.println("Printing updated value of a : " + a);
        System.out.println("Printing updated value of a : " + b);


        // set bit count karne ka tareeka
        int x = 2523;
        int count = 0;
        while(x > 0) {
            if((x&1) != 0) {
                //mujhe ek set bit mil gyi
                count++;
            }
            // right shift to remove this bit
            x = x >> 1;
        }
        System.out.println("Set bit count : " + count);


        // check if number is power of 2 or not

        int y = 64;
        if((y & (y-1)) == 0) {  // condn : n&(n-1)
            System.out.println("This number is power of 2");
        }
        else {
            System.out.println("This number is not power of 2");
        }


        // remove the last bit : concept n&(n-1)
        int l = 10;

        int k = l & (l-1);
        System.out.println("After removing last set bit : " + (l & (l-1)));
        System.out.println("After removing last set bit : " + k);
        // get last set bit
        System.out.println("After getting last set bit : " + (l&(-l)));







    }



}
