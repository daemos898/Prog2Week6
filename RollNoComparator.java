import java.util.Comparator; //Import necessary utility

public class RollNoComparator implements Comparator<StudentInfo> { //Method for sorting by roll number
    @Override
    public int compare(StudentInfo s1, StudentInfo s2) {
        return s1.rollno - s2.rollno;
    }
}