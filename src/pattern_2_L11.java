public class pattern_2_L11 {
    static void main() {
        //right angle triangle

        int n = 5;
        for(int row = 1; row <= n; row++) {
            //for each row -> variable colomns
            //formula -> col-> 1-> value or row
            for(int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            //move to the next line
            System.out.println();

        }

    }
}
