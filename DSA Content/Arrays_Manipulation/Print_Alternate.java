package Arrays_Manipulation;

public class Print_Alternate {
    // print the ele of an array in alternate format

    static void printAlter(int[] arr) {
        // two pointer approach
        int n = arr.length;
        //1st pointer
        int i = 0;
        //2nd poiter
        int j = n-1;
        while(i<=j) {
            if(i==j) {
                System.out.print(arr[i]);
                return;
            }
            else {
                // i<j
                System.out.print(arr[i]);
                i++;
                System.out.print(arr[j]);
                j--;
            }
        }
    }

    static void main() {
        int[] arr = {1,2,4,5,6};
        printAlter(arr);
    }

}
