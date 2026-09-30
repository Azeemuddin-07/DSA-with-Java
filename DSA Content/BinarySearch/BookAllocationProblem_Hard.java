package BinarySearch;

public class BookAllocationProblem_Hard {

    static boolean isValidAnswer(int[] arr, int k, long maxPages ) {
        // check whether mid is a valid solution or not.
        int studentCount = 1;
        long pages = 0;

        for(int i=0; i<arr.length; i++) {
            if(pages + arr[i] <= maxPages ) {
                // iska matlab currnnt book xan be assigned
                // as itt is not out of limit
                // then assign
                pages = pages + arr[i];
            }
            else {
                // current student ko current book
                // xannot be assigned wala case
                studentCount++;

                if(studentCount > k || arr[i] > maxPages) {
                    return false;
                }
                else {
                    // can be assign to new student
                    pages = 0;
                    pages = pages + arr[i];
                }
            }
        }
        return true;

    }


    public int findPages(int[] arr, int k) {

        // to find valid answer , books count must be >= students present

        if(arr.length < k) {
            return -1;
        }


        int n = arr.length;
        long s = 1;

        // sum nikalne ka formula
        long sum = 0;
        for(int i=0; i<n; i++) {
            sum = sum + arr[i];
        }

        // total sum
        long e = sum;

        long ans = -1;

        while(s <= e) {
            long mid = s+(e-s)/2;

            if(isValidAnswer(arr,k,mid)) {
                // true wala case
                ans = mid;
                e = mid - 1;
            }
            else {
                // false wala case
                s = mid + 1;
            }
        }
        return (int) ans;

    }

}
