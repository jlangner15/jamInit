import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class testingBand {

    private Guitarist Jimmy;
    private Bassist John;
    private Drummer Bonzo;
    private Singer Robert;

    @BeforeEach
    void setUp(){
        Jimmy = new Guitarist(-1, "Professional", "lead", "ALi", 27, "M");
        John = new Bassist(100, "Professional", "lead", "John Paul Jones", 25, "M");
        Bonzo = new Drummer(5, "Professional", "John Bonham", 23, "M");
        Robert = new Singer(10, "Professional", "lead", "ALi", 23, "M");

    }

    @Test
    void testMakeBand(){
        Band LedZeppelin = new Band("Led Zeppelin", Bonzo, John, Jimmy, Robert);

        assertEquals(LedZeppelin.getNumMembers(), 4);
    }
}
