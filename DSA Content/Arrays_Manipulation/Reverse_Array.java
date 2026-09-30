package Arrays_Manipulation;

public class Reverse_Array {
    // reverse an array - while loop used in
    static void ReverseEl(int [] arr) {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<j) {
            // swap
            int temp = arr[i]; // arr[i] ka value filhal temp me rakh diye aur arr[i] khali hua
            arr[i] = arr[j];   // arr[j] ka value khali wala arr[i] me rakh diye
            arr[j] = temp;     // finally temp me jo arr[i] ka value tha wo khali wala arr[j] me rakh diye
            // i ko aage badhao
            i++;
            // j ko peeche laao
            j--;
        }
        // now your array has been reversed
        // print each element
        for(int k : arr) {
            System.out.print(k + " ");
        }
    }

    static void main() {
        int[] arr = {1,3,4,5,6,7,8};
        ReverseEl(arr);
    }

// tc - o(n) , sc - o(1)

}
