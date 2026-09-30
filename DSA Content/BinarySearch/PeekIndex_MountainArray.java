package BinarySearch;

public class PeekIndex_MountainArray {
    static int getPeakIndex(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        while(s<e) {

            int mid = s+(e-s)/2;

            if(arr[mid] < arr[mid+1]){
                // main abhi ascending order walw part me hu
                // iska mtlb mai left part m hu
                //or mujhe pta hai answer right m h
                // to fatafat right part me move karlo
                s = mid +1;
            }
            else{
                // arr[mid]>= arr[mid+1}
                // iska mtlb mai right part me hun
                // iska matlab mai ek potential solution pr khada hu
                ans = mid;
                // noe i have to find the final answer
                // mujhe pata hai right part decending order wala hai
                // to bada number agar exist karta hai, to pakk aleft me hi milega
                // left me move karo
                e = mid -1;
            }
        }
        return ans;
    }

    static void main(String[] args) {
        int[] arr = {50,60,70,80,35,34,25};
        int IndexOfPeakElement = getPeakIndex(arr);
        System.out.println(IndexOfPeakElement);
    }

}
