import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvalideWcTest {

    @Test
    void weiger() {
        InvalideWc A = new InvalideWc();
        assertFalse(A.weiger(false,false,true));
        assertTrue(A.weiger(true,false,true));
        assertTrue(A.weiger(true, true , false));
        assertFalse(A.weiger(true, false,false));

    }
}