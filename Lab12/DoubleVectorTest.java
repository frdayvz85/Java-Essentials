import org.junit.Test;

public class DoubleVectorTest {
    @Test
    public void equalsIsReflexis() {
        DoubleVector v1 = new DoubleVector(4, 2);
        assertTrue(v1.equals(v1));
    }

    @Test
    public void equalsIsSymmetric() {
        DoubleVector v1 = new DoubleVector(4, 2);
        DoubleVector v2 = new DoubleVector(4, 2);
        // assertTrue(v1.equals(v2));
        if (v1.equals(v2)) {
            assertTrue(v2.equals(v1));
        }
        if (v2.equals(v1)) {
            assertTrue(v1.equals(v2));
        }
    }

}
