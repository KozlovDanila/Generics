public class MoreThenZero<T extends Number> implements Predicate<T> {
    public boolean checkValue(T value) {
        return value.intValue() > 0;
    }

}
