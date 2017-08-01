import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Set;
import java.util.TreeSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomSet2Test {

    CustomSet2<Integer> customSet = null;

    @Before
    public void beforeTest() throws InvalidCapacityException {
        customSet = new CustomSet2<Integer>();
    }

    @After
    public void afterTest() {
        customSet.clear();
    }

    @Test
    public void CustomSetClassWithDefaultConstructorTest() {
        assertNotNull(customSet);
    }

    @Test
    public void CustomSetClassWithCapacityConstructorTest() throws InvalidCapacityException {
        CustomSet2<Integer> customSet2 = null;
        customSet2 = new CustomSet2<Integer>(50);
        final int expectd = customSet2.getCapacity();
        assertEquals(expectd, 50);
    }

    @Test
    public void WhenUsedWithCollectionThenInitializeSetTest() throws InvalidCapacityException {
        CustomSet2<Integer> customSet2 = null;
        final Integer[] s = new Integer[10];
        customSet2 = new CustomSet2<Integer>(s, 10);
        final int exptdSize = customSet2.size();
        assertEquals(exptdSize, 10);
    }

    @Test
    public void WhenCallAddOnSetThenAddElementTest() throws InvalidCapacityException {

        final Set<Integer> ts = new TreeSet<Integer>();
        ts.add(10);
        CustomSet2<String> customSet2 = null;
        customSet2 = new CustomSet2<String>();
        customSet2.add("test");

        final int expectd = customSet2.getCapacity();
        final int size = customSet2.size();
        final boolean c = customSet2.contains("test");
        assertEquals(c, true);
        assertEquals(size, 1);
        assertEquals(expectd, 100);
    }

    @Test
    public void WhenContainsForStringThenReturnTrue() {

        customSet.add(3);
        final int expectd = customSet.getCapacity();
        final int size = customSet.size();
        assertEquals(size, 1);
        assertEquals(expectd, 100);
    }

    @Test
    public void WhenComparedWithSamesetThenReturnTrue() {
        CustomSet2<Integer> customSet2 = null;
        customSet2 = new CustomSet2<Integer>();
        customSet2.add(3);
        customSet.add(3);
        final boolean expectd = customSet.equals(customSet2);
        assertEquals(expectd, true);
    }
}
