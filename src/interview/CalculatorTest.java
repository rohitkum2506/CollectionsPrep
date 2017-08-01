package interview;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void CaclualtorClassInitializationTest() {
        Assert.assertNotNull(calculator);
    }

    @Test
    public void WhenEmptyStringinAddMethodReturn0() {
        final String actual = calculator.Add("");
        final String expected = String.valueOf(0);
        Assert.assertEquals(expected, actual);
    }

}
