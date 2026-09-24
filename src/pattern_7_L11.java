public class pattern_7_L11 {
    static void main() {


        int n =6;
        for(int row=1; row<=n; row++) {
            // for each row 6 colomn
            for(int col=1; col<=6; col++) {
                if(row==1 || row==n) {
                    System.out.print("* ");
                }
                else{
                    //middle row
                    if(col==1 || col==6) {
                        System.out.print("* ");
                    }
                    //middle colomn
                    else {
                        System.out.print("  ");
                    }
                }
            }
            // move to the next row
            System.out.println();

        }








    }
}
