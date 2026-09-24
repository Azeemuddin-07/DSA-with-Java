public class numericalPyramid {
    static void main() {
        int n = 4;

        for(int row=1; row<=n; row++) {
            //part 1
            for(int col=1; col<=n-row; col++) {
                System.out.print("  ");
            }
            //part 2
            for(int col=1; col<=row; col++) {
                System.out.print(col + " ");
            }
            //part 3
            // this concept is for print decrement value of counting
            int rowVal = row;
            int decRowVal = row-1;
            //for here ^
            for (int col=1; col<=row-1; col++) {
                System.out.print(decRowVal + " ");
                decRowVal--;
            }
            System.out.println();
        }
    }
}
