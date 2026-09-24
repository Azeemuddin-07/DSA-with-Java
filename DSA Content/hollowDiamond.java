public class hollowDiamond {
    static void main() {
        int n = 5;

        for(int row=1; row<=n; row++) {
            //for each row --- variable col
            //part 1
            for (int col=1; col<= n-row; col++) {
                System.out.print("  ");
            }
            //part 2
            if (row == 1) {
                for (int col=1; col<=2*row-1; col++) {
                    System.out.print("* ");
                }
            }
            else {
                //middle rows
                //1*
                System.out.print("* ");
                //2r-3 spaces
                for (int col=1; col<=2*row-3; col++) {
                    System.out.print("  ");
                }
                //1*
                System.out.print("* ");
            }
            System.out.println();

        }

        // part 2 below inverted triangle

        for(int row=1; row<=(n-1); row++) {
            // for each row -> variable col

            // part 1
            for(int col=1; col<=row; col++) {
                System.out.print("  ");
            }
            // part 2
            if(row==(n-1)) {
                System.out.print("* ");
            }
            else {
                //remaining rows
                //1 *
                System.out.print("* ");
                // (2(n-r)-3
                for(int col=1; col<=2*(n-row)-3; col++) {
                    System.out.print("  ");
                }
                //1*
                System.out.print("* ");
            }
            //move to the next row
            System.out.println();


        }













    }
}
