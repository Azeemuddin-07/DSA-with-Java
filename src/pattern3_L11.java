public class pattern3_L11 {
    static void main() {

        int n = 5;

        for(int row=1; row<=n; row++) {
            //for each row -> spaces, stars

            //spaces
            for(int col=1; col<=n-row; col++) {
                System.out.print("  ");
            }
            //stars
            for(int col=1; col<=n; col++) {
                System.out.print("* ");
            }
            //move to next row
            System.out.println();
        }
    }
}
