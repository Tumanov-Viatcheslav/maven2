import myPet.pets.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCat {
    @Test
    void testCatConstructor() {
        Assertions.assertDoesNotThrow(() -> new Cat("Whitey"));
    }

    @Test
    void testCatName1() {
        Cat cat = new Cat("Whitey");
        Assertions.assertEquals("Nya", cat.makeSound());
    }
    @Test
    void testCatName2() {
        Cat cat = new Cat("Whitey");
        Assertions.assertDoesNotThrow(cat::makeSound);
    }
    @Test
    void testCatName3() {
        Cat cat1 = new Cat("Whitey");
        Cat cat2 = new Cat("Blackey");
        Assertions.assertNotEquals(cat1.getName(), cat2.getName());
    }

    @Test
    void testCatSound1() {
        Cat cat = new Cat("Whitey");
        Assertions.assertDoesNotThrow(cat::getName);
    }
    @Test
    void testCatSound2() {
        Cat cat = new Cat("Whitey");
        Assertions.assertEquals("Whitey", cat.getName());
    }
    @Test
    void testCatSound3() {
        Cat cat1 = new Cat("Whitey");
        Cat cat2 = new Cat("Blackey");
        Assertions.assertEquals(cat1.makeSound(), cat2.makeSound());
        Assertions.assertEquals(cat2.makeSound(), cat1.makeSound());
    }
}
