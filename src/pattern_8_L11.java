public class pattern_8_L11 {
    static void main() {

        int n = 10;

        for(int row=1; row<=n; row++) {
            //for each row -> variable colomn
            if(row==1 || row==2 || row==n) {
                for(int col=1; col<=row; col++) {
                    System.out.print("* ");
                }

            }
            else {
                //middle rows
                ////1* print
                System.out.print("* ");
                //(row-2)
                for(int col=1; col<=(row-2); col++) {
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
