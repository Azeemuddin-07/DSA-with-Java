package Java_Map_Interface_3;

import java.util.*;


public class Comparable_Interface {
    public static void main(String[] args) {
        // creation of ArrayList
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(25);
        list.add(5);
        // isme jo value pahle aaye wo pahle store hoga
        System.out.println("Printing list befor : " + list);
        // sorting
        Collections.sort(list);
        System.out.println("Printing list after : " + list);





        // agar khud ka custom sorting agar likhna hai to khud ka custom logic/custom comprator logic likhna hoga.

        List<Student> students = new ArrayList<>();

        students.add(new Student(19, "Vishal", 68));
        students.add(new Student(25, "Billu", 30));
        students.add(new Student(25, "Pulkit", 78));
        students.add(new Student(38, "Adarsh", 62));

        System.out.println("Before sorting : " + students);
    //  Collections.sort(students); --> ye directly sort nahi karega isliye student class ko implements to comparable banana parega.
        Collections.sort(students);
        System.out.println("After sorting : " + students);





        // another method of sorting
        // comparator define
        Collections.sort(students, new Comparator<Student>(){
            public int compare(Student o1, Student o2) {
                return o1.weight - o2.weight;
            }

        }); // iska enhaced version symbolic form wala hai

        // comprator in symbolic form - most easiet form vvi)
        Collections.sort(students,(o1,o2) -> o1.weight - o2.weight);
        System.out.println(students);






        // isme naya class create karna parta hai

        // ab comparator ko alag class me define karna ek professional tareeka hai
        // ex - ek compratorWeight(jo chahiye wo class likho) naam ka class create karo.
// easy to use.

        Collections.sort(students, new ageComparator());
        System.out.println(students);







        //Use of own made comparator

        Integer[] arr = {7,3,8,6,1};

        Arrays.sort(arr);
        for(int a : arr) {
            System.out.print(" " + a);
        }

        System.out.println(" ");

        System.out.println(" Here is own made comparator");

        Arrays.sort(arr, new ReverseComprator());
        for(int a : arr) {
            System.out.print(" " + a);
        }






    }
}
