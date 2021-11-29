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
        Jimmy = new Guitarist(15, "Professional", "lead", "Jimmy Page", 27, "M");
        John = new Bassist(13, "Professional", "lead", "John Paul Jones", 25, "M");
        Bonzo = new Drummer(15, "Professional", "John Bonham", 23, "M");
        Robert = new Singer(10, "Professional", "lead", "Rober Plant", 23, "M");

        Jimmy.addGenre("Rock");
        Jimmy.addGenre("Blues");
        Jimmy.addGenre("Folk");

        John.addGenre("Rock");
        John.addGenre("Blues");

        Bonzo.addGenre("Rock");

        Robert.addGenre("Rock");



    }

    @Test
    void testMakeBand(){
        Band LedZeppelin = new Band("Led Zeppelin", Bonzo, John, Jimmy, Robert);

        assertEquals(LedZeppelin.getNumMembers(), 4);
    }

    @Test
    void testFindEachMember() {
        Band milk = new Band("Milk", null, null, null, Robert);

        milk.findGuitarist(5, Skill.Professional);
        milk.findBassist(5, Skill.Professional);
        milk.findDrummer(5, Skill.Professional);

        System.out.println(milk.getNumMembers());

        assertEquals(milk.getNumMembers(), 4);

    }

    @Test
    void testFindIncompatibleMusician() {
        Band psychy = new Band("Milk", Bonzo, John, null, Robert);

        allGuitarists.removeGuitarist(Jimmy);

        Guitarist Kevin = new Guitarist(5, "Professional", "lead", "Kevin Parker", 35, "M");
         Kevin.addGenre("Alternative");

        psychy.findGuitarist(5, Skill.Professional);

        assertEquals(psychy.getNumMembers(), 3);

    }

}
