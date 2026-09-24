public class NumericalPattern {
    static void main() {
        int n = 5;
        for(int row=1; row<=n; row++) {
            for(int col=1; col<=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }

        // counting print

        int m = 5;
        int count = 1;
        for(int row=1; row<=m; row++) {
            for(int col=1; col<=row; col++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

        // alphabet print in right angle triangle

        int o = 5; /// here o=n
        for(int row=1; row<=o; row++) {
            for(int col=1; col<=row; col++) {
                int a = col;
                int b = ('A' - 1);
                int ans = a+b;
                char finalAns = (char)ans;
                System.out.print(finalAns+" ");
            }
            System.out.println();
        }

        // from d to a in right angle

        int x= 5; /// here o=n
        for(int row=1; row<=x; row++) {
            for(int col=1; col<=row; col++) {
                int a = n-col;
                int b = 'A';
                int ans = a+b;
                char finalAns = (char)ans;
                System.out.print(finalAns+" ");
            }
            System.out.println();
        }
    }
}
