import myPet.pets.Raven;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRaven {
    @Test
    void testRavenConstructor() {
        Assertions.assertDoesNotThrow(() -> new Raven("Wise"));
    }

    @Test
    void testRavenName1() {
        Raven raven = new Raven("Wise");
        Assertions.assertDoesNotThrow(raven::getName);
    }
    @Test
    void testRavenName2() {
        Raven raven = new Raven("Wise");
        Assertions.assertEquals("Wise", raven.getName());
    }
    @Test
    void testRavenName3() {
        Raven raven1 = new Raven("Wise");
        Raven raven2 = new Raven("Smart");
        Assertions.assertNotEquals(raven1.getName(), raven2.getName());
    }

    @Test
    void testRavenSound1() {
        Raven raven = new Raven("Wise");
        Assertions.assertDoesNotThrow(raven::makeSound);
    }
    @Test
    void testRavenSound2() {
        Raven raven = new Raven("Wise");
        Assertions.assertEquals("Caaar", raven.makeSound());
    }
    @Test
    void testRavenSound3() {
        Raven raven1 = new Raven("Wise");
        Raven raven2 = new Raven("Smart");
        Assertions.assertEquals(raven1.makeSound(), raven2.makeSound());
        Assertions.assertEquals(raven2.makeSound(), raven1.makeSound());
    }
}
