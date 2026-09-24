public class pattern_5 {
    static void main() {
                int n = 5;
        for(int row=1; row<=n; row++) {
            //for space print
            for(int col=1; col<=n-row; col++) {
                System.out.print("  ");
            }
            //stars
            for(int col=1; col<=2*row-1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
