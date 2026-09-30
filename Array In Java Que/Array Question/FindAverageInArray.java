public class FindAverageInArray {

    public static double getAverage(int[] arr) {
        // logic of find the sum
        double sum = 0;
        for(int i : arr) {  // TOC(Time complexity) - o(n) & SOC - o(1)
            sum = sum + i;
        }
        // loop kahan tak chalega
        int size = arr.length;
        // avg. nikalne ka logic
        double avg = sum / size;
        return avg;

    }

    public static void main() {
        int[] arr = {2,4,3,6,7};
        System.out.println(getAverage(arr));

    }



}