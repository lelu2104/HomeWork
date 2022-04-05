package HW5;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class OperationsTest {
    double a = 10;
    double b = 2;

    @Test
    public void testAddition() {
        Double expected = 12.0;
        Double actual = Operations.addition(a,b);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSubtraction() {
        double expected = 8;
        double actual = Operations.subtraction(a,b);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testMultiplication() {
        double expected = 20;
        double actual = Operations.multiplication(a,b);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testDivision() {
        double expected = 5;
        double actual = Operations.division(a,b);
        Assert.assertEquals(actual, expected);
    }
}