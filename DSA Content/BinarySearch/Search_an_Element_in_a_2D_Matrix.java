package BinarySearch;

public class Search_an_Element_in_a_2D_Matrix {
    // matrix = {}{}

    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;

        int row = 0;
        int col = totalCol-1;

        while(row < totalRow && col>= 0) {
            if(matrix[row][col] == target) {
                return true;
            }
            else if(matrix[row][col] > target) { // target chhota hai to
                col--; // same row me ek colomn peeche chale jaao
            }
            else {
                // matrix[row][col] < target  -> target bada hai to
                row++; // same colomn me ek row aage chale jaao
            }
        }
        return false;
    }
}
