package ArrayQue;

public class Homework_3 {
    // print extreme element of an array - means pritn 1st and last element till the middle element

    static void PrintExtreme(int [] arr) {
       int i = 0;     // start
       int j = arr.length -1;   //end

        while(i<=j) {
            System.out.print(arr[i] + " ");
            if(i != j ) {
                System.out.print(arr[j] + " ");

            }
            i++;
            j--;
        }
    }


    static void main() {
        int[] arr = {2,3,4,5,6,7,8,9,10};
        PrintExtreme(arr);
    }

}
