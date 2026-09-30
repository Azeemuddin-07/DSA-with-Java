package SortingAlgos;

public class bubbleSort {
    static void BubbleSort(int[] arr){ // TC - O(n^2)
        int n = arr.length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] > arr[j+1]) { // neighbouring element is comparing
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void main(String[] args) {
        int[] arr = {2,1,4,6,5,3};
        BubbleSort(arr);

        System.out.println("Printing the array : ");
        for(int value : arr) {
            System.out.print(value + " ");
        }
    }
}
