import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class UtilsTest {

    @Test
    public void testingFilter() {
        Double[] array = {1.0,2.0,3.0,4.0};
        Predicate<Number> predicate = new MoreThenZero<>();
        Double[] temp = Utils.<Double>filter(array, predicate);
        Assert.assertTrue( Arrays.equals(temp, array));
    }


    @Test
    public void testingFindMiddleElementWithDouble() {
        Double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
        Predicate<Number> predicate = new MoreThenZero<>();
        Double temp = Utils.<Double>findCentralElement(array);
        Assert.assertEquals(temp,(Double)3.0);
    }

    @Test
    public void testingFindMiddleElementWithInt() {
        Integer[] array = {1, 2, 3, 4, 5};
        Predicate<Number> predicate = new MoreThenZero<>();
        Integer temp = Utils.<Integer>findCentralElement(array);
        Assert.assertEquals(temp,(Integer) 3);
    }
}