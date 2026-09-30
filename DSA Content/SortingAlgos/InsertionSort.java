package SortingAlgos;

public class InsertionSort {
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i=1; i<n; i++){
            int curr = i;
            int prev = i-1;
            int currValue = arr[i];
            // shifting
            while(prev>=0 && currValue < arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // ab hamare pass ek kali jagah aa chuki hai
            // place the currentValue
            arr[prev+1] = currValue;
        }
        
    }

    static void main(String[] args) {
        int[] arr = {2,1,5,3,6,4};
        insertionSort(arr);
        System.out.println("Printing sorted arr : ");
        for(int value : arr) {
            System.out.print(value + " ");
        }
    }
}
