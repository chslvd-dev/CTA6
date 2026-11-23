/**
 * NameComparator.java
 * Orders students alphabetically by name, ignoring upper and lower case.
 *
 * Critical Thinking Assignment, Module 6
 * Chris Jayson Salvadora
 */
import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return a.getName().compareToIgnoreCase(b.getName());
    }
}
