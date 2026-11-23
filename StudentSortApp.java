/**
 * StudentSortApp.java
 * Stores 10 student objects in an ArrayList, then sorts them
 * by roll number and by name with the custom selection sort.
 * Runs 2 test cases with different hard coded student lists.
 *
 * Critical Thinking Assignment, Module 6
 * Chris Jayson Salvadora
 */
import java.util.ArrayList;

public class StudentSortApp {

    public static void main(String[] args) {
        // Test case 1: mixed order
        ArrayList<Student> test1 = new ArrayList<>();
        test1.add(new Student(107, "Maria Lopez", "12 Oak St, Phoenix"));
        test1.add(new Student(102, "James Carter", "45 Pine Ave, Tempe"));
        test1.add(new Student(110, "Aisha Khan", "8 Cedar Rd, Mesa"));
        test1.add(new Student(101, "David Kim", "22 Elm St, Chandler"));
        test1.add(new Student(105, "Sofia Rossi", "90 Birch Ln, Gilbert"));
        test1.add(new Student(103, "Ethan Brooks", "31 Maple Dr, Scottsdale"));
        test1.add(new Student(109, "Olivia Nguyen", "17 Ash Ct, Peoria"));
        test1.add(new Student(104, "Lucas Silva", "64 Willow Way, Glendale"));
        test1.add(new Student(108, "Chloe Martin", "5 Spruce Pl, Surprise"));
        test1.add(new Student(106, "Noah Patel", "73 Aspen Blvd, Avondale"));
        runTest("TEST CASE 1: Mixed order", test1);

        // Test case 2: reverse roll numbers, lowercase names, shared first letters
        ArrayList<Student> test2 = new ArrayList<>();
        test2.add(new Student(220, "zoe hill", "1 A St, Tucson"));
        test2.add(new Student(219, "Adam Reyes", "2 B St, Yuma"));
        test2.add(new Student(218, "adrian cole", "3 C St, Flagstaff"));
        test2.add(new Student(217, "Mia Torres", "4 D St, Prescott"));
        test2.add(new Student(216, "mark lee", "5 E St, Sedona"));
        test2.add(new Student(215, "Ben Ortiz", "6 F St, Kingman"));
        test2.add(new Student(214, "Grace Wu", "7 G St, Casa Grande"));
        test2.add(new Student(213, "ryan shaw", "8 H St, Payson"));
        test2.add(new Student(212, "Lily Evans", "9 I St, Bisbee"));
        test2.add(new Student(211, "Henry Ford", "10 J St, Globe"));
        runTest("TEST CASE 2: Reverse order, mixed case names", test2);
    }

    // Prints the list as entered, then sorted by roll number, then by name
    private static void runTest(String title, ArrayList<Student> students) {
        System.out.println("##### " + title + " #####");
        printList("Original order", students);

        SelectionSort.sort(students, new RollnoComparator());
        printList("Sorted by roll number", students);

        SelectionSort.sort(students, new NameComparator());
        printList("Sorted by name", students);
    }

    private static void printList(String title, ArrayList<Student> list) {
        System.out.println("=== " + title + " ===");
        System.out.println(String.format("%-6s %-18s %s", "Roll", "Name", "Address"));
        for (Student s : list) {
            System.out.println(s);
        }
        System.out.println();
    }
}
