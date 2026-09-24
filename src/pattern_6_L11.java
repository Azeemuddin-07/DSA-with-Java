public class pattern_6_L11 {
    static void main() {
        int n = 4;

        for(int row=1; row<=n; row++) {
            //for each row -> variables colomns
            //for space print
            for(int col=1; col<=row-1; col++) {
                System.out.print("  ");
            }
            //for star print
            for(int col=1; col<=2*n-2*row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
