/**
 * RollnoComparator.java
 * Orders students by roll number, lowest to highest.
 *
 * Critical Thinking Assignment, Module 6
 * Chris Jayson Salvadora
 */
import java.util.Comparator;

public class RollnoComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return Integer.compare(a.getRollno(), b.getRollno());
    }
}
