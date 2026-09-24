public class Method_Java_L12 {
        // Method in Java - it is type of entity to enable the reuse block of code
        // "main" method is used to take input and give the output
        // Basic syntax of Method :- returnType methodName (parameters) {
                                                                           // method body
                                                //                       }
        static void print2Table() {
            for(int i = 1; i <= 10; i++) {
                int ans = 2*i;
                System.out.println(ans);
            }

        }
        // 2nd create method

        static void printSum(int x, int y) {
            System.out.println("Sum = " + (x+y));
        }

        static int multiply(int p, int q) {
            int r = p * q;
            return r;
        }

        static void main() {
            System.out.println("Hi");
            //call/invoke method
            // if main method is static then calling method need to be a static
             print2Table();
             //above is method call
            System.out.println("Bye");
            // method call
            printSum(2,3);
            // Method call
            int mul = multiply(2, 13);
            System.out.println("mul = " + mul);
            // if here write the return -- then program will be terminated, no matter next code is not exucated
        }

}
