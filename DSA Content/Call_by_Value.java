public class Call_by_Value {
    // call by value -- create a copy of that value in their respective method

    static void solve(int num) {
        System.out.println("inside solve : " + num);
        num = 10* num;
        System.out.println("inside solve : " + num);
    }


  //Method and variable local scoping-- means variable create for that method is called local scoping
    static void printmultiplies() {
        int value = 18;
        for (int i = 1; i <= value; i++) {
            System.out.println(value*i);

        }
        System.out.println(value);
    }


    static void main() {
        //call by value -- copy of that value in solve() method in above
        int num = 5;
        System.out.println("inside main : " + num);
        solve(num);
        System.out.println("inside main : " + num);

        //this is not call by value because the value is created in another method
        //System.out.println(value);
        // In local scoping -- value only work on that method where is created, lifetime will be work for that method
        printmultiplies();
    }
}
