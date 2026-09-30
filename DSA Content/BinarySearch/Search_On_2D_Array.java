package BinarySearch;

public class Search_On_2D_Array {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;

        int n = totalRow * totalCol;
        // think like 1D array
        int s = 0;
        int e = n-1;

        // Binary Search

        while(s <= e ) {
            int mid = s+(e-s)/2;
            int rowIndex = mid / totalCol; // this give us the index of row.
            int colIndex = mid % totalCol;

            if(matrix[rowIndex][colIndex] == target) {
                return true;
            }
            else if(matrix[rowIndex][colIndex] > target) {
                // left
                e = mid -1;
            }
            else {
                // move right
                s = mid+1;
            }
        }
        return false;

    }
}
