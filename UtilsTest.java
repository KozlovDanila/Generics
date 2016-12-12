import org.junit.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class UtilsTest {

    @Test
    public void testingFilter() {

        List<Double> list = new ArrayList<>();
        Predicate<Number> predicate = new MoreThenZero<>();
        list.add(1.2);
        list.add(-1.2);
        list.add(1.2);
        list.add(1.2);
        List<Number> checkList = new ArrayList<>();
        checkList.add(1.2);
        checkList.add(1.2);
        checkList.add(1.2);
        List<?> tempList = new ArrayList<>();
        tempList = Utils.<Number>filter(list, predicate);
        Assert.assertTrue(tempList.equals(checkList));
    }


    @Test
    public void testingFindMiddleElementWithDouble() {
        List<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(1.1);
        list.add(1.2);
        Predicate<Number> predicate = new MoreThenZero<>();
        Double temp = Utils.<Double>findCentralElement(list);
        Assert.assertEquals(temp,(Double)1.1);
    }

    @Test
    public void testingFindMiddleElementWithInt() {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(4);
        Predicate<Number> predicate = new MoreThenZero<>();
        Integer temp = Utils.<Integer>findCentralElement(list);
        Assert.assertEquals(temp,(Integer) 2);
    }
}
