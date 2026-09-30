package BinarySearch;

public class Row_with_Maximum_1s {
    // que - you are given a non empty grid matrix with n rows and m oclomns
    // consistency of only 0s and 1s. each row in the grid sorted in ascending order.
    // your task is to find the index of the row with the  maximum number of 1s.
    // if multiple rows have the same number of 1s, return the index of the first such row.
    // if no row contains at least one 1, return -1.

    static int getFirstOccIndex(int[][] arr, int rowIndex) {
        int totalRow = arr.length;
        int totalCol = arr[0].length;

        int target = 1;
        int ans = -1;
        // handling case where there is no 1 inside the row
        if(arr[rowIndex][totalCol-1] == 0) { // yahan pe zero isliye diya hai ki array sorted hai, agr last wala 0 mila to ek bhi 1 nahi hoga
            // it means there is no 1 inside this row
            return totalCol;   // 1s count = totalCol - FirstOccOf1s
            // yahan totalCol isliye liye return kiya hai taki overall count zero aa jaaye
        }
        else {
            // 1 exist inside the row
            int s = 0;
            int e = totalCol-1;

            while(s <= e) {
                int mid = s+(e-s)/2;
                if(arr[rowIndex][mid] == 0) {
                    // move to right
                    s = mid+1;
                }
                else{
                    // ==1 wala case
                    ans = mid;
                    // left move
                    e = mid-1;
                }
            }
        }
        return ans;
    }




    public int rowWithMaxOnes(int[][] mat) {
        int totalRow = mat.length;
        int totalCol = mat[0].length;
        int maxi = -1;
        int maxOneWaliRowIndex = -1;
        // move to each row and for each row
        // find the first occurance
        // using the F.O. will calculate the count of 1s
        // update the maxi variabke or the ans index variable basis on that
        for(int row=0; row<totalRow; row++){
            // for each row, find F.O
            int firstOccIndex = getFirstOccIndex(mat,row);
            // claculate number of 1s in this row
            int oneCount = totalCol - firstOccIndex;
            // update maxi or ans index variablw basis on count
            if(oneCount !=0 && oneCount > maxi) {
                // ho sakta hai ki current row hi answer ho
                maxi = oneCount;
                maxOneWaliRowIndex = row;
            }
        }
        return totalCol;
    }

}
