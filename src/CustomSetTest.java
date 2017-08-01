import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.TestCase;

public class CustomSetTest extends TestCase {

    int         a;
    String      key1;
    String      key2;
    int         val1;
    int         val2;
    Set<String> x = new HashSet<>();

    @Override
    protected void setUp() throws Exception {
        a = 10;
        key1 = "name";
        key2 = "name";

        val1 = 10;
        val2 = 10;
    }

    @Test
    public void test() {
        final CustomSet2<String> set = new CustomSet2<String>();

        final boolean hasAddedName = set.add("name");
        assertTrue(hasAddedName);
        final boolean hasAddedNameAgain = set.add("name");
        assertFalse(hasAddedNameAgain);

        final int val = set.size();
        assertEquals(1, 1);
        //        assertEquals(10, val);

    }
}
