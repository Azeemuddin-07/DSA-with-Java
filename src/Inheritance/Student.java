package Inheritance;

public class  Student {
    // OOP concept for class & object creation
    //
    // Attributes

    // Properties
    public int id;
    public int age;
    public String name;
    public double height;
    public int nos; // no. of subject
    // Encapsulation
    private String gf; // it is eg of encapsulation


    // Default constructor=ctor // attribute garbage
    public Student() {

        System.out.println("OOPs.Student Default ctor Called");
    }

    // parametarised ctor

    public Student(int id, int age, String name, double height, int nos, String gf) {
        System.out.println("OOPs.Student Parametarised ctor Called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.height = height;
        this.nos = nos;
        this.gf = gf;

    }


    // copy ctor
    public Student(Student srcobj) {   // srcobj -> A
        System.out.println("OOPs.Student copy ctor Called");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.height = srcobj.height;
        this.nos = srcobj.nos;
    }


    //Method & Behaviour
    public void study() {
        System.out.println(name + " Studying");
    }

    public void bunk() {
        System.out.println(name + " Bunking");
    }

    public void sleep() {
        System.out.println(name + " Sleeping");
    }

    // Encapsulation method
    private void gfChatting() {
        System.out.println(name + " gfChatting");

    }



    // Encapsulation - Bind data and method in a class.
    // Like a capsule, it combines and bind them together.
    // provide secure layer, Hide internal implementation of codeand data in a class.
    // Access modifier - Public, Private & protected.

    // example of perfect encapsulation - everything is private but create a method public




}