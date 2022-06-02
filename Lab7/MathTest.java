import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathTest {
    public static final double EPSILON = 0.00001;

    @Test
    public void testPosRaisedToPos() { // 2^3
        assertEquals(8, MathUtils.power(2, 3), EPSILON);
    }

    @Test
    public void testPosRaisedToZero() { // 200^0
        assertEquals(1, MathUtils.power(200, 0), EPSILON);
    }

    @Test
    public void testZeroRaisedToPos() { // 0^309
        assertEquals(0, MathUtils.power(0, 309), EPSILON);
    }

    @Test
    public void testZeroRaisedToZero() { // 0^0
        assertEquals(1, MathUtils.power(0, 0), EPSILON);
    }

    @Test
    public void testPosRaisedToNeg() { // 2^-2
        assertEquals(0.25, MathUtils.power(2, -2), EPSILON); // not corect
    }

    @Test
    public void testOneRaisedToPos() {
        assertEquals(1, MathUtils.power(1, 33567), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroRaisedToNeg() {
        MathUtils.power(0, -4);
    }

    // base is -ve, exp is -ve

}
