import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTest {

    // --- Cas sans exception (TC1 à TC15) ---

    @Test
    public void tc01_nextDate() {
        assertEquals(new Date(1700, 6, 21), new Date(1700, 6, 20).nextDate());
    }

    @Test
    public void tc02_nextDate() {
        assertEquals(new Date(2005, 4, 16), new Date(2005, 4, 15).nextDate());
    }

    @Test
    public void tc03_nextDate() {
        assertEquals(new Date(1901, 7, 21), new Date(1901, 7, 20).nextDate());
    }

    @Test
    public void tc04_nextDate() {
        assertEquals(new Date(3456, 3, 28), new Date(3456, 3, 27).nextDate());
    }

    @Test
    public void tc05_nextDate() {
        assertEquals(new Date(1500, 2, 18), new Date(1500, 2, 17).nextDate());
    }

    @Test
    public void tc06_nextDate() {
        assertEquals(new Date(1700, 6, 30), new Date(1700, 6, 29).nextDate());
    }

    @Test
    public void tc07_nextDate() {
        assertEquals(new Date(1800, 11, 30), new Date(1800, 11, 29).nextDate());
    }

    @Test
    public void tc08_nextDate() {
        assertEquals(new Date(3453, 1, 30), new Date(3453, 1, 29).nextDate());
    }

    @Test
    public void tc09_nextDate() {
        // 444 est bissextile (divisible par 4, pas un siècle)
        assertEquals(new Date(444, 3, 1), new Date(444, 2, 29).nextDate());
    }

    @Test
    public void tc10_nextDate() {
        assertEquals(new Date(2005, 5, 1), new Date(2005, 4, 30).nextDate());
    }

    @Test
    public void tc11_nextDate() {
        assertEquals(new Date(3453, 1, 31), new Date(3453, 1, 30).nextDate());
    }

    @Test
    public void tc12_nextDate() {
        assertEquals(new Date(3456, 3, 31), new Date(3456, 3, 30).nextDate());
    }

    @Test
    public void tc13_nextDate() {
        assertEquals(new Date(1901, 8, 1), new Date(1901, 7, 31).nextDate());
    }

    @Test
    public void tc14_nextDate() {
        assertEquals(new Date(3453, 2, 1), new Date(3453, 1, 31).nextDate());
    }

    @Test
    public void tc15_nextDate() {
        assertEquals(new Date(3457, 1, 1), new Date(3456, 12, 31).nextDate());
    }

    // --- Cas avec exception (TC16 à TC20) ---

    @Test
    public void tc16_nextDate_exception() {
        assertThrows(IllegalArgumentException.class, () -> new Date(1500, 2, 31).nextDate());
    }

    @Test
    public void tc17_nextDate_exception() {
        // 1500 n'est pas bissextile (siècle non multiple de 400)
        assertThrows(IllegalArgumentException.class, () -> new Date(1500, 2, 29).nextDate());
    }

    @Test
    public void tc18_nextDate_exception() {
        assertThrows(IllegalArgumentException.class, () -> new Date(-1, 10, 20).nextDate());
    }

    @Test
    public void tc19_nextDate_exception() {
        assertThrows(IllegalArgumentException.class, () -> new Date(1458, 15, 12).nextDate());
    }

    @Test
    public void tc20_nextDate_exception() {
        assertThrows(IllegalArgumentException.class, () -> new Date(1975, 6, -50).nextDate());
    }
}

