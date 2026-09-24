import java.util.Scanner;

public class For_loop_L10 {
    static void main() {
        //for loop eg- for(initialization; condition; updation)

//        for (int i = 1; i <= 10; i++) {
//            System.out.println("value of i:" + i);
//        }
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Ajju");
//        }
//// Odd number printer loop
//        for (int i = 1; i<= 20; i += 2) {
//            System.out.println(i);
//        }
////Even number printer loop
//        for (int i = 2; i<= 20; i += 2) {
//            System.out.println(i);
//        }
//
//// Nested for loop
//
//        for (int i = 1; i<= 4; i++) {
//            for (int j = 1; j <= 4; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= 4; j++) {
//                System.out.println("i = " + i + " j =  " + j);
//            }
//        }
//// jaise hi mere loop ke andar break keyword mil jaaye to current/nearest loop se bahar nikal dega
//        for (int i = 1; i<= 10; i++) {
//            if (i==5) {
//                break;
//            }
//            System.out.println(i);
//        }

// contineu keyword : if condition ke andar jo bhi keyword likha hai use skip kar dega aur current for loop ke updation step pe le jayega

//        for (int i = 1; i<= 10; i++) {
//            if (i == 1 || i == 2 || i == 3 || i == 4) {
//                continue;
//            }
//            System.out.println(i);
//        }

        //while loop - iteration will be in the last
           // initialization
//           int i = 1;
//          //condition
//           while(i<=10) {
//               //process
//               System.out.println("Ajju");
//               //updation
//               i++;
//           }

//        // Nested while loop
//
//        //initilization
//        int i = 1;
//        //condition
//        while (i <= 2)  {
//            int j = 1;
//            while (j <= 3) {
//                System.out.println("i=" + i + "j=" + j);
//                j++;
//            }
//            i++;
//        }
//
        //do-while loop - pahli iteration me condition kabhi check nahi hota, matlab kam se kam ek baar to chalega.

              //init
              int i = 1;
              //condition
              do {
                  System.out.println(i);
                  //updation
                  i++;
              } while (i <= 0);
              //condition


      }
}
