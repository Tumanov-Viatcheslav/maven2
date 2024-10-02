import myPet.pets.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDog {
    @Test
    void testDogConstructor() {
        Assertions.assertDoesNotThrow(() -> new Dog("Bob"));
    }

    @Test
    void testDogName1() {
        Dog dog = new Dog("Bob");
        Assertions.assertEquals("Bob", dog.getName());
    }
    @Test
    void testDogName2() {
        Dog dog = new Dog("Bob");
        Assertions.assertDoesNotThrow(dog::getName);
    }
    @Test
    void testDogName3() {
        Dog dog1 = new Dog("Bob");
        Dog dog2 = new Dog("Sharik");
        Assertions.assertNotEquals(dog1.getName(), dog2.getName());
    }

    @Test
    void testDogSound1() {
        Dog dog = new Dog("Bob");
        Assertions.assertDoesNotThrow(dog::makeSound);
    }
    @Test
    void testDogSound2() {
        Dog dog = new Dog("Bob");
        Assertions.assertEquals("Wuf", dog.makeSound());
    }
    @Test
    void testDogSound3() {
        Dog dog1 = new Dog("Bob");
        Dog dog2 = new Dog("Sharik");
        Assertions.assertEquals(dog1.makeSound(), dog2.makeSound());
        Assertions.assertEquals(dog2.makeSound(), dog1.makeSound());
    }
}
