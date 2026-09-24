package BitwiseOperator;

public class PrintUniqueValueByBitwise {
    public static int findUnique(int[] arr) {
        // que - Find unique value (all others appear twice)
        int unique = 0;
        for(int num : arr) {
            unique ^= num;
        }
        return unique;
    }

    public static void main(String[] args) {
        // que - Find unique value (all others appear twice)
        int[] arr = {10,24,17,24,10,13,17};
        System.out.println("Printing unique number is : " + findUnique(arr));
    }
}
