import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GraderTest {
    @Test
    public void fiftyNineShouldReturnF() {
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    public void sixtyEightShouldReturnG() {
        var grader = new Grader();
        assertEquals('G', grader.determineLetterGrade(68));
    }

    @Test
    public void seventFiveShouldReturnH() {
        var grader = new Grader();
        assertEquals('H', grader.determineLetterGrade(75));
    }

    @Test
    public void eightyFiveShouldReturnI() {
        var grader = new Grader();
        assertEquals('I', grader.determineLetterGrade(85));
    }

}
