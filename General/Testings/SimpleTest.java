import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SimpleTest {
    @Test
    public void twoPlusTwoShouldEqualFour() {
        SimpleCalculator calculator = new SimpleCalculator();
        // assertEquals(4, calculator.add(2, 2));
        assertTrue(calculator.add(2, 2) == 4);
    }

    @Test
    public void twoPlusFiveShouldEqualSeven() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(7, calculator.add(2, 5));
    }

    @Test
    public void twentyPlusTenShouldEqualThirty() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(30, calculator.add(20, 10));
    }

}
