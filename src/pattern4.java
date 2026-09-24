public class pattern4 {
    static void main() {

        int n = 5;
        for(int row=1; row<=n; row++) {
            // for each row --> variable coloumns
            for(int col=1; col<=n-row+1; col++) {
                System.out.print("* ");
            }
            // move to next line
            System.out.println();
        }


    }
}
