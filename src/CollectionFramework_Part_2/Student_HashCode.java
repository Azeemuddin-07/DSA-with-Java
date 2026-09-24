package CollectionFramework_Part_2;

import java.util.Objects;

public class Student_HashCode {

    public int rollNo;

    public String Name;


    @Override
    public String toString() {
        return "Student_HashCode{" +
                "rollNo=" + rollNo +
                ", Name='" + Name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student_HashCode that = (Student_HashCode) o;
        return rollNo == that.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }

    public Student_HashCode(int rollNo, String Name) {
        this.rollNo = rollNo;
        this.Name = Name;

    }



}
