public class pattern_9 {
    static void main() {
        int n = 5;

        for(int row=1; row<=n; row++) {
            //for each row -> variable col
            //part 1
            for(int col=1; col<=n-row; col++) {
                System.out.print("  ");
            }
            //part 2
            if(row==1 || row==n) {
                for(int col=1; col<=2*row-1; col++) {
                    System.out.print("*  ");
                }
            }
            else {
                //middle rows
                //1*
                System.out.print("* ");
                //2r-3 space
               for(int col=1; col<=2*row-1; col++) {
                   System.out.print("  ");
               }
                //1*
                System.out.print("* ");
            }
            //move to next row
            System.out.println();
        }

    }
}
