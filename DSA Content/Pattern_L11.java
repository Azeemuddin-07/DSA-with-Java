public class Pattern_L11 {
    public static void main(String[] args) {
        //solid square pattern

        int n = 4;

        for(int row = 1; row <= n; row++) {
            //for each row --> n colomns
            for(int col = 1; col <= n; col++) {
                // print star
                System.out.print("* ");
            }
            //move to next line
            System.out.println();
        }
    }
}
