import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathTest {
    public static final double EPSILON = 0.00001;

    @Test
    public void testOneRaisedToTwo() { // 1->2
        assertEquals(3, MathUtils.Increment(2), EPSILON);
    }

}