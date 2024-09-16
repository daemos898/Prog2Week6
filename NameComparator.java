import java.util.Comparator; //Import necessary utility

public class NameComparator implements Comparator<StudentInfo> { //Method for sorting list by name
    @Override
    public int compare(StudentInfo s1, StudentInfo s2) {
        return s1.name.compareTo(s2.name);
    }
}