import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrijsTest {

    @Test
    void prijsBerekenen() {
        Prijs A = new Prijs();
        assertEquals(0.0,A.PrijsBerekenen(false, true, true, 1));
        assertEquals(1.0,A.PrijsBerekenen(true, false, false, 1));
        assertEquals(0.0,A.PrijsBerekenen(false, true, true, 5));
        assertEquals(0.75,A.PrijsBerekenen(true, false, false, 5));
        assertEquals(0.5,A.PrijsBerekenen(true, false, true, 8));
        assertEquals(0.0,A.PrijsBerekenen(false, true, false, 8));
    }
}