package Inheritance;

public class App {
    public static void main(String[] args) throws Exception {
        // Default ctor
//        OOPs.Student A = new OOPs.Student();
//        A.id = 1;
//        A.age = 15;
//        A.name = "Tarikh";
//        A.nos = 5; // nos - number of subject
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.sleep();
//        A.study();
//

        // parameterised ctor
//        OOPs.Student A = new OOPs.Student(1, 15, "Rahul", 5.8, 5, "Tina");
//
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//       System.out.println(A.height);
//
//
//        A.bunk();
//        A.sleep();
//        A.study();

        // copy constructor
//        OOPs.Student B = new OOPs.Student(A);
//
//        System.out.println(B.name);
//        System.out.println(B.age);
//        System.out.println(B.id);
//        System.out.println(B.nos);
//        System.out.println(B.height);
//
//        B.sleep();



        // Encapsulation
        Student A = new Student(1, 15, "Rahul", 5.8, 5, "Tina");

        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);
        System.out.println(A.height);
        // it give the error
//        System.out.println(A.gf);

        A.bunk();
        A.study();
        A.sleep();
        // it is private so give the
//        A.gfChatting();

        // perfect encapsulation




    }
}
