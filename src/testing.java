import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class testing {

    @Test
    void testMethod(){
        assertTrue(true);
    }

    @Test
    void testAddMusicians(){
        Musician alice = new Musician("Alice Smith", 34, "F");
        Musician bob = new Musician("Bob Shear", 20, "M");
        Musician charlie = new Musician("Charlie", 25, "M");

        assertTrue(alice.getName().equals("Alice Smith") && bob.getAge() == 20 && charlie.getGender().equals("M"));
    }

    @Test
    void addIllegalMusicians(){

    }



}
