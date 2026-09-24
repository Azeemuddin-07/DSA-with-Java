import java.math.BigInteger;
import java.util.Scanner;

public class Input {
    static void main() {
//        int a = 7;
//        int b = 8;
//
//        System.out.println(a+b);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number");

        int firstNum = sc.nextInt();
        System.out.println("Enter the second Number");

        int secondNum = sc.nextInt();
        int ans = firstNum + secondNum;

        System.out.println("The answer is: " + ans);

        System.out.println("Enter the Big Integer");
        BigInteger bg = sc.nextBigInteger();

        System.out.println("The answer is: " + bg);
        boolean flag = sc.nextBoolean();

        System.out.println("The answer is: " + flag);

        sc.close();



    }
}
