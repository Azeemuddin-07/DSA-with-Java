package Java_Map_Interface_3;

public class Student implements Comparable<Student>{
    // instance variable
    public int age;

    public String name;

    public int weight;

    // constructor
    public Student(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    // create method of  get() and set()

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



    @Override
    public String toString() {
        return "Student{" +
                "weight=" + weight +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }



    // ye method current object (this) ko compare karne ke liye likha
    @Override
    public int compareTo(Student that) {
        // this method is called for current object
        // we will define our logic here

        // sort basis on age
        if(this.age == that.age) {
            return this.name.compareTo(that.name);
        }
        return this.age - that.age;
    }

}
