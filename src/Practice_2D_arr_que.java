public class Practice_2D_arr_que {
    public static void main() {

        int arr[][] = { {1,2 ,3}, {5, 4, 3}};
        int sum = 0;
        // for sum of all element of an 2D array
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                int value = arr[i][j];
                sum = sum + value;
            }

        }
        System.out.println("Addition of all element in 2D array is : " + sum);


        // for multiplication of all element in 2D array


        int mul = 1;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                int ans = arr[i][j];
                mul = mul*ans;

            }
        }
        System.out.println("Multiply of all element in 2D array is : " + mul);

        // For maximum value

        int maxValue = arr[0][0];

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]>maxValue) {
                    //update
                    maxValue = arr[i][j];

                }

            }

        }
        System.out.println(maxValue);

        int minValue = arr[0][0];

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[0][0] < minValue) {
                    //update
                    minValue = arr[i][j];
                }
            }
        }
        System.out.println(minValue);



    }
}
