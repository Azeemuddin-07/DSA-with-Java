import java.util.Scanner;

public class Arrays_in_Java {
    // array -- array is a continues memory allocation data structure
    // integer is 4-byte storage occupied
    // creation and declaration -- int arr []; or int [] arr , here int is type of data. arr[] means this is array
    // Memory allocate  --> arr = new int [3];
    // initialization --> int arr[] = {98, 95, 32};

    static void main() {
        // declaration
        int arr[];
        // allocation
        arr = new int[5];
        //init
        int brr[] = {10,30,40};

        //accessing element in array
        // index is a location value of element in array
        // it is always start with zero means 0
        System.out.println("value at index 0 " + brr[0]);
        System.out.println("value at index 1 " + brr[1]);
        System.out.println("value at index 2 " + brr[2]);

        // length of an array
        int n = brr.length;
        System.out.println(n);

        // now for print the all value of array, this kind will be sufficient
        //for loop is print all index in some line of code
        for (int index = 0; index <= n-1; index++) {
            System.out.println(index + " " + brr[index]);
        }

        // now for each loop is enhance version of for loop.

        for (int value : brr) {
            System.out.println(value);
        }

        // how to take input in array
        int crr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int m = crr.length;
        // for loop for take input from users
        for (int i = 0; i <= m-1; i++) {
            System.out.println("Provide input for index " + i);
            crr[i] = sc.nextInt();

        }
        //print all element of an array
        for (int val: crr) {
            System.out.println(val);
        }






    }




}
