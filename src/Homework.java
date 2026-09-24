public class Homework {

    // first question
    static void printWelcome() {
        System.out.println("Welcome to Homework");
    }
    // second question
    static void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    // third question
    static void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }

    }

    // 4th question
    static void getMaximum(int a, int b){
        if (a>b){
            System.out.println("maximum");
        }
        else{
            System.out.println("minimum");
        }

    }

    // 5th question
    static void calculatePercentage(int obtained,int total) {

        int percentage = obtained*100/total;

        System.out.println(percentage);

    }

    // 6th question
    static void overload(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }
    static void overload(String x, String y){
        System.out.println(x);


    }

    // 7th question





    static void main() {
        printWelcome();
        add(1,2);
        isEven(9);
        getMaximum(1,2);
        calculatePercentage(50,100);
        overload(1, 2);
        overload("Hello", "Bye");

    }
}
