/**
 * SelectionSort.java
 * Custom selection sort for an ArrayList of students.
 * Uses no sort method from the Java collections library.
 * The comparator passed in decides the sort order.
 *
 * Critical Thinking Assignment, Module 6
 * Chris Jayson Salvadora
 */
import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort {

    public static void sort(ArrayList<Student> list, Comparator<Student> comparator) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            // Find the smallest student in the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            // Swap it into position i
            if (minIndex != i) {
                Student temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }
}
