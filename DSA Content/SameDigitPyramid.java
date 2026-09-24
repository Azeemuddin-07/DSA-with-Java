public class SameDigitPyramid {
    static void main() {

        int n = 4;
        for(int row=1; row<=n; row++) {
            //part 1
            for(int col=1; col<=n-row; col++) {
                System.out.print("  ");
            }
            // part 2
            for(int col=1; col<=2*row-1; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
