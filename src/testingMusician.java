import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class testingMusician {

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
    void testAddIllegalMusicians(){
        Musician zak = new Musician("", 1, "M");
        Musician yusif = new Musician("yusif arman", 0, "M");

        assertNull(zak.getName());
        assertEquals(yusif.getAge(), 0);

    }

    @Test
    void testChangeAttributes(){
        Musician alice = new Musician("Alice Smith", 34, "F");
        Musician bob = new Musician("Bob Shear", 20, "M");
        Musician charlie = new Musician("Charlie", 25, "M");

        alice.changeAge(35);
        bob.changeName("Billy Shear");

        assertTrue(alice.getAge() == 35 && bob.getName().equals("Billy Shear"));

    }

    @Test
    void testChangIllegalAttributes(){
        Musician zak = new Musician("zal brescott", 35, "M");
        Musician yusif = new Musician("yusif arman", 24, "M");
        Musician xander = new Musician("xander thistle", 40, "F");

        zak.changeAge(0);
        yusif.changeName("");
        yusif.changeAge(-5);

        System.out.println(xander.getAge());

        assertEquals(zak.getAge(), 35);
        assertTrue(yusif.getName().equals("yusif arman"));
        assertEquals(xander.getAge(), 40);

    }



}

