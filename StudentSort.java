import java.util.ArrayList; //Import necessary utilities
import java.util.Comparator;

public class StudentSort {
    public static <T> void sort(ArrayList<T> list, Comparator<? super T> comparator) { //Creates method in which the lists will be sorted
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            T temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }
}