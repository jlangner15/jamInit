import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class testingBand {

    Guitarist Jimmy;
    Bassist John;
    Drummer Bonzo;
    Singer Robert;

    @BeforeAll
    void setUp(){
        Guitarist Jimmy = new Guitarist(-1, "Professional", "lead", "ALi", 27, "M");
        Bassist John = new Bassist(100, "Professional", "lead", "John Paul Jones", 25, "M");
        Drummer Bonzo = new Drummer(5, "Professional", "John Bonham", 23, "M");
        Singer Robert = new Singer(10, "Professional", "lead", "ALi", 23, "M");

    }

    @Test
    void testMakeBand(){
        Band LedZeppelin = new Band("Led Zeppelin",Bonzo, John, Jimmy, Robert);

        assertEquals(LedZeppelin.getNumMembers(), 4);
    }
}
