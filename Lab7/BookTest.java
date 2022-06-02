import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class BookTest {

    @Before
    public void setUp() {
        Book.resetId();
    }

    @After
    public void tearUp() {
        Book.resetId();
    }

    @Test
    public void Book_setParam() {
        Book b1 = Book.make("abc", "def", "EDUCATIONAL", "100");
        Book b2 = Book.make("abc", "def", "EDUCATIONAL", "100");

        assertEquals(100, b1.getReservePrice());
        assertEquals(100, b2.getReservePrice());

        assertEquals(0, b1.getId()); // 3
        assertEquals(1, b2.getId());
    }

    @Test
    public void make_parsesTypes() {
        // covers int check
        assertEquals(null, Book.make("abc", "def", "SCIFI", "tenthousand"));

        // covers enum check
        assertEquals(null, Book.make("abc", "def", "SCIENCE", "90"));

        // ok
        assertNotEquals(null, Book.make("abc", "def", "PHILOSOPHY", "90"));

    }

    @Test
    public void make_checksValues() {
        // cover title string null
        assertEquals(null, Book.make("abc", null, "SCIFI", "10000"));

        // cover title length null
        assertEquals(null, Book.make("abc", "n", "SCIFI", "10000"));

        // cover reserve price positivity
        assertEquals(null, Book.make("abc", "name", "SCIFI", "0"));
        assertEquals(null, Book.make("abc", "nam", "SCIFI", "-700"));

        // ok
        assertNotEquals(null, Book.make("abc", "fine", "SCIFI", "10000"));

    }

    @Test
    public void make_checkTitle() {
        // letter-digit-whitespace
        assertEquals(null, Book.make("abc", "$$$", "SCIFI", "10000"));

        // letter->ok
        assertNotEquals(null, Book.make("abc", "uiytr", "SCIFI", "10000"));

        // number->
        assertNotEquals(null, Book.make("abc", "786", "SCIFI", "10000"));

        // whitespace - > ok
        assertNotEquals(null, Book.make("abc", "   ", "SCIFI", "10000"));
    }

    // isSameGenre()

    // compare

}