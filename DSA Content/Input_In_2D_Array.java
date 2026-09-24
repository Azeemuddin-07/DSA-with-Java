import java.util.Scanner;

public class Input_In_2D_Array {
    public static void main() {

        int arr[][] = new int [3][4];
        Scanner sc = new Scanner(System.in);

// Taking input from user

        for(int i=0; i<=arr.length-1; i++) {
            for(int j=0; j<=arr[i].length-1; j++) {
                System.out.println("Provide the value of row :" + i + " and colomn :" + j );
                arr[i][j] = sc.nextInt();
            }
        }

//        for(int i=0; i<=arr[i].length-1; i++) {
//            for(int j=0; j<=arr[j].length-1; ) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
        for(int rowIndex=0; rowIndex<=arr.length-1; rowIndex++) {
            for(int colIndex=0; colIndex<=arr[rowIndex].length-1; colIndex++) {
                System.out.print(arr[rowIndex][colIndex] + " ");
            }
            System.out.println();

        }




    }
}
