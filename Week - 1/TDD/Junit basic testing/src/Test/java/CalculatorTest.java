import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(8, c.add(5,3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, c.subtract(5,3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, c.multiply(5,3));
    }
}