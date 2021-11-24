import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class testingMusicianTypes {

    @Test
    void testMakeGuitarist() {
        Guitarist Jimmy = new Guitarist(15, "Professional", "lead", "Jimmy Page", 27, "M");

        assertTrue(Jimmy.getExperience() == 15 && Jimmy.getSkill().equals(Skill.Professional) && Jimmy.getRoles().contains("lead") && Jimmy.getName().equals("Jimmy Page") && Jimmy.getAge() == 27 && Jimmy.getGender().equals("M"));
    }

    @Test
    void testMakeIllegalGuitarists() {
        Guitarist ali = new Guitarist(-1, "Professional", "lead", "ALi", 27, "M");
        Guitarist bo = new Guitarist(100, "noob", "lead", "Bo", 27, "M");
        Guitarist cam = new Guitarist(5, "Intermediate", "", "Bo", 27, "M");

        assertFalse(ali.isValid());
        assertFalse(bo.isValid());
        assertFalse(cam.isValid());
    }

    @Test
    void testChangeGuitaristAttributes() {
        Guitarist Jimmy = new Guitarist(1, "Professional", "lead", "Jimmy Page", 27, "M");
        Guitarist Eric = new Guitarist(14, "Beginner", "lead", "Eric Clapton", 28, "M");
        Guitarist Jeff = new Guitarist(13, "Professional", "rhythm", "Jeff Beck", 29, "M");

        Jimmy.changeExperience(15);
        Eric.changeSkill("Professional");
        Jeff.addRole("lead");

        assertEquals(Jimmy.getExperience(), 15);
        assertEquals(Eric.getSkill(), Skill.Professional);
        assertTrue(Jeff.getRoles().contains("rhythm") && Jeff.getRoles().contains("lead"));

    }

    @Test
    void testChangeIllegalGuitaristAttributes() {
        Guitarist Jimmy = new Guitarist(15, "Professional", "lead", "Jimmy Page", 27, "M");
        Guitarist Eric = new Guitarist(14, "Professional", "lead", "Eric Clapton", 28, "M");

        Jimmy.changeExperience(-1);
        Eric.changeSkill("too good");

        assertEquals(Jimmy.getExperience(), 15);
        assertEquals(Eric.getSkill(), Skill.Professional);

    }


}
