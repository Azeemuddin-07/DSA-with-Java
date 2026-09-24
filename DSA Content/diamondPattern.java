public class diamondPattern {
    static void main() {

        int n = 4;
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


        //part2

        for(int row=1; row<=n; row++) {
            //for each row -> variables colomns
            //for space print

            if(row == 1) {
                //for skip the row -- use continue keyword
                continue;
            }

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
