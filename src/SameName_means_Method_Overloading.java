public class SameName_means_Method_Overloading {
    // Same Name of two or more method is called Method Overloading, But consider parameter will be different

    static int add (int a, int b) {
        int sum = a + b;
        return sum;
    }

    static int add (int a, int b, int c) {
        int ans = a + b + c;
        return ans;
    }

    static void main() {
        int ans1 = add(2, 5, 7);
        int ans2 = add(2, 5);
        System.out.println("ans1 = " + ans1 + " ans2 = " + ans2);
    }

}
