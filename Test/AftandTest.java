import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AftandTest {

    @Test
    void getAfstand() {
        Aftand A = new Aftand();
        assertEquals("wc is dichtbij", A.getAfstand(0));
        assertEquals("wc is dichtbij", A.getAfstand(1));
        assertEquals("wc is dichtbij", A.getAfstand(2));
        assertEquals("wc is verder weg", A.getAfstand(3));
        assertEquals("wc is verder weg", A.getAfstand(4));
        assertEquals("wc is verder weg", A.getAfstand(5));
        assertEquals("wc is ver weg", A.getAfstand(6));
        assertEquals("wc is ver weg", A.getAfstand(7));


    }
}