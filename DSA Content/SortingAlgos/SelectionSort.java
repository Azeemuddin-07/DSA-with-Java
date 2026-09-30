package SortingAlgos;

public class SelectionSort{

    static void selectionSort(int[] arr) {
        // outer loop for rounds
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            int minIndex = i;
            // inner loop -> comparison
            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // jab mera comparison complete ho jayega
            // to minIndex wali value ko correct position pr place kar dena
            // swap arr[i] , arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    static void main(String[] args) {
        int[] arr = {2,1,5,3,6,4};
        selectionSort(arr);
        System.out.println("Printing sorted arr : ");
        for(int value : arr) {
            System.out.print(value + " ");
        }
    }
}
