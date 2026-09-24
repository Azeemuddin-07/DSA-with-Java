public class Array_2D_L13 {
    public static void main() {
        // 2D array -- 2D array original memory me continues located hota hai but sequential ke hisab se
        // isme row aur colomn hota hai
        // ise likhne ke tarike -- arr[index of row][index of colomn];
        // 2D array --> its an array of arrays. it also take a continues space, isme row2 jo hai row1 ke baad hi aata hai aur isi tarah next row pahle wale row ke baad ek hi row me aata hai
// isme memory jo allocate hoti hai wo ek strech me hi allocate hoti hai

        // declaration
        int arr[][];

        // allocation
        arr = new int[3][4];
        //initialization
        int[][] brr = {
                {1,2},
                {2,3,5,6,9},
                {3,4,1,3},
                {4}
        };
        // print
        //System.out.println(brr[3][5]);
        // print all element

//        int rowLength = brr.length;
//        //int colLength = brr[0].length;
//
//        for(int rowIndex=0; rowIndex<=rowLength-1; rowIndex++) {
//            // jagged array means different colomn for different row
//            // jaise hi mai kisi new row me aaya
//            //same point par maine uss row ka colLength find out kar lunga
//            //current row - brr[rowIndex]
//            // isme kitne colomns -> brr[rowIndex].length
//            int colLength = brr[rowIndex].length;
//            for(int colIndex=0; colIndex<=colLength-1; colIndex++) {
//                System.out.print(brr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }

        //traversal 2D array

        for(int rowIndex=0; rowIndex<=brr.length-1; rowIndex++) {
            for(int colIndex=0; colIndex<=brr[rowIndex].length-1; colIndex++) {
                System.out.print(brr[rowIndex][colIndex] + " ");
            }
            System.out.println();

        }











    }
}
