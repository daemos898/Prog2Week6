import java.util.ArrayList; //Import array list utility

public class Main {
    public static void main(String[] args) {
        ArrayList<StudentInfo> students = new ArrayList<>(); //Add each student and their relevant info
        students.add(new StudentInfo(3, "Ben", "1502 N. Oak Ln\n"));
        students.add(new StudentInfo(5, "Kassandra", "309 1st St\n"));
        students.add(new StudentInfo(2, "Leonard", "8526 S. Maple St\n"));
        students.add(new StudentInfo(4, "Xavier", "5591 51st Ave S\n"));
        students.add(new StudentInfo(1, "Daniel", "625 Appleton Rd\n"));

        System.out.println("Original List:"); //Print the original list with no sorting
        System.out.println(students);

        System.out.println("\nSorted by Name:"); //Print list sorted by name
        StudentSort.sort(students, new NameComparator());
        System.out.println(students);

        System.out.println("\nSorted by Roll Number:"); //Print list sorted by roll number
        StudentSort.sort(students, new RollNoComparator());
        System.out.println(students);
    }
}