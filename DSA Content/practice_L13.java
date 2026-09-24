public class practice_L13 {
    static void main() {
        // practice session


        int arr[] = {1, 3, -8, 12, -4, 21};
        // declare the length of an array
        int n = arr.length;


        //print all element in the array
        for(int i=0; i<=n-1; i++) {
            System.out.println(arr[i]);
        }


        // find sum of all  element in the array
        int sum = 0;
        for(int i=0; i<=n-1; i++) {
            int value = arr[i];
            sum = sum + value;
        }
        //print sum
        System.out.println("sum of all element" + " " + sum);



        //find multiply of all element in the array
        int mul = 1;
        for(int i=0; i<n; i++) {
            int value = arr[i];
            mul = mul * value;
        }
        //print multiply
        System.out.println("multiply of all element " + " " + mul);




        // find maximum element in array
        int maxValue = arr[0];

        //compare maxValue ko array k har element se
        for(int i=0; i<n; i++) {
            //minimum value ke liye bas arr[i] < minValue likh do
            if(arr[i] > maxValue) {
                //update maxValue
                maxValue = arr[i];

            }
        }
        // print maximum value
        System.out.println("Maximum value in array :"+" " + maxValue);




    }

}

