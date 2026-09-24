import java.util.Scanner;

public class condition_if_else {
    static void main(){

        //        int dialyPractice = 12;
//        if (dialyPractice >= 10) {
//            System.out.println("Good Consistency");
//        }
//
//        int age = 12;
//        if (age > 18) {
//            System.out.println("You are eligible to vote");
//        }
//        else {
//            System.out.println("You are not eligible to vote");
//        }
////
//        int accuracy = 78;
//        if (accuracy >= 90) {
//            System.out.println("Excellent");
//        }
//        else if (accuracy >= 75) {
//            System.out.println("Good");
//        }
//        else if (accuracy >= 60) {
//            System.out.println("Average");
//        }
//        else {
//            System.out.println("Needs Improvement");
//        }

//        boolean hasSubscription = true;
//        int solvedProblem = 200;
//
//        if (hasSubscription) {
//
//            if (solvedProblem >= 220) {
//                System.out.println("Unlock advanced sheet");
//            }
//            else {
//                System.out.println("Soved the more problem to unlock the sheet");
//            }
//        }
//        else {
//            System.out.println("Soved the more problem to unlock the sheet");
//        }
//
//
//        int age = 12;
//        char gender = 'M';
//
//        if (gender == 'M') {
//            System.out.println("You are a male");
//            if (age >= 18) {
//                System.out.println("You are a male and age > 18");
//            }
//            else {
//                System.out.println("You are a male and age < 18");
//            }
//
//        }
//        else {
//            System.out.println("You are a female");
//            if (age >18) {
//                System.out.println("You are a female and age > 18");
//            }
//            else {
//                System.out.println("You are a female and age < 18");
//            }
//        }

        // Ternary Operator
//
//        int streakDays = 35;
//
//        String status = (streakDays >= 30) ? "Consistent" : "Irregular";
//
//        System.out.println(status);
//
//        int age = 10;
//
//        int ans = (age >=18) ? 22 : 12;
////        if (age > 18) {
////            age = 22;
////        }
////        else {
////            age = 12;
////        }
//        System.out.println(ans);



          //Switch statement.(if-else ko likhne ka behtar tareeka)

        System.out.println("Enter the value of day");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Friday");
        }



    }
}
