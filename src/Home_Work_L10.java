import java.util.Scanner;

public class Home_Work_L10 {
    public static void main() {
//        //print counting -- take input from user print 1 to n
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter Number, where do you want to count :");
//        int n = sc.nextInt();
//
//        for (int i = 1; i<=n; i++) {
//            System.out.println(i);
//        }
//        sc.close();

// que 2 -- print counting from n to 1

//        for (int i = 20; i>=1; i--) {
//            System.out.println(i);
//        }

//que 3 -- print the 10 multiple of n

//          Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number, where do you want to count the multiple of 10");
//        int n = sc.nextInt();
//        for (int i = 1; i<=n; i++ ) {
//            System.out.println(i*10);
//        }
//        sc.close();

// que -- print your name 100 time

//          for (int i = 1; i <= 100; i++) {
//              System.out.println("AJJU");
//          }

        // que -- print all prime number 1 to 100

//

//        //que -- print the sum of all number from 1 to n
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number where do want to sum of all number");
//
//        int n = sc.nextInt();
//
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum = sum + i;
//        }
//        System.out.println("The sum is  :" + sum);

        //que -- print the all number which is perfectly divisible by 7
        for (int i = 50; i<= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}

