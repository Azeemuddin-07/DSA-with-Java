package Java_Map_Interface_3;

import java.util.Comparator;

public class ageComparator implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }

}
