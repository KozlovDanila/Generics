import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Utils {

    public static <T> T[] filter(T[] array, Predicate<? super T> predicate) {
        if (array == null) {
            return array;
        }

        if (predicate == null) {
            throw new IllegalArgumentException("Predicate is null");
        }

        T[] ret = null;
        for (T value : array) {
            if (predicate.checkValue(value)) {
                ArrayUtils.add(ret, value);
            }
        }
        return ret;
    }

    public static <T extends Comparable<T>> T findCentralElement(T[] array) {
        if (array == null) {
            throw new NullPointerException("Array is empty");
        }

        T[] temp;
        temp = array.clone();
        Arrays.sort(temp);
        return temp[temp.length / 2 ];
    }

}
