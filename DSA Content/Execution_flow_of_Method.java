public class Execution_flow_of_Method {
    //execution flow of method

    void main() {
        System.out.println("Hi");
        solve();
        System.out.println("What is Your Name");
    }

    void solve() {
        System.out.println("Sir");
        int ans = add(1,3);
        System.out.println(ans);
        System.out.println("Bye");
    }
    int add(int a, int b) {
        System.out.println("Hello");
        int ans = a + b;
        return ans;
        //after that (return) there will be no code executed
        //System.out.println("Ajju");

    }

    // Important Points about Method signature

    // Method signature means - All name of method is called method signature
    // eg -- int add (int a, int b) --- this is method signature
    // in method signature -- we know --> return type, method name and paramter ( in teeno ka pata chalta hai)

    // Method call Stack --> stack is a type of data structure
    // Method Call stack --> Working...
    //

}
