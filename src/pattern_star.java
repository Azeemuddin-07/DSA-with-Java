public class pattern_star {
    static void main() {
       int n = 4;

       for(int row=1; row<=n; row++) {

           for(int col=1; col<=6; col++) {
               if(row==1 || row==n) {
                   System.out.print("* ");
               }
               else  {
                   if(col==1 || col==n) {
                       System.out.print("* ");
                   }
                   else{
                       System.out.print(" ");
                   }
               }
           }
       }
       System.out.println();

    }
}
