package CollectionFramework_Part_2;

import java.util.HashSet;

public class HashCode_equals {
    public static void main() {

        HashSet<Student_HashCode> set = new HashSet<>();

        Student_HashCode s1 = new Student_HashCode(1, "Ajju");
        Student_HashCode s2 = new Student_HashCode(1, "Ajju");
        Student_HashCode s3 = new Student_HashCode(1, "Ajju");

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);

    }
}
