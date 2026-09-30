package BinarySearch;
// pivot means - ek aisa point jahan se array ke element puri tarah se alag ho jaaye
// ex - {50,60,70,1,2,3,4} - yahan 70 ek pivot element hai aur uska index 2 hai

public class FindPivotElement {
    // find the pivot index of a rotated array
    static int getPivotEl(int[] arr ) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        while(s <= e) {
            int mid = s + (e-s)/2;

            if(arr[mid] <= arr[n-1]){
                // iska matlb hm l2 wali line pr h
                // answer to l1 wali line pr h
                // iska matlab move to l1 or left
                e = mid - 1;
            }
            else {
                // mid mera l1 pr hi h already
                // ans store
                ans = mid;
                // move to right
                s = mid + 1;
            }
        }
        return ans;
    }


    static void main(String[] args) {
        int[] arr = {50,60,70,10,20,30,40};
        System.out.println(getPivotEl(arr));
    }
}
