import java.util.*;

public class Utils {


    public static <T> List<? extends T> filter(List<? extends T> list, Predicate<? super T> predicate) {
        if (list.isEmpty()) {
            return null;
        }

        if (predicate == null) {
            throw new IllegalArgumentException("Predicate is null");
        }

        List<T> ret = new ArrayList<>();
        for (T value : list) {
            if (predicate.checkValue(value)) {
                ret.add(value);
            }
        }
        return ret;
    }

    public static <T extends Comparable<? super T>> T findCentralElement(Collection<? extends T> array) {
        if (array == null) {
            throw new NullPointerException("Array is empty");
        }
        List<T> temp = new ArrayList<T>(array);
        Collections.sort(temp);
        return temp.get(temp.size() / 2);
    }

}
