import myPet.pets.Cat;
import myPet.pets.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPets {
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
        Cat cat1 = new Cat("Whitey");
        Cat cat2 = new Cat("Blackey");
        Assertions.assertNotEquals(cat1.getName(), cat2.getName());
    }

    @Test
    void testCatSound1() {
        Cat cat = new Cat("Whitey");
        Assertions.assertEquals("Whitey", cat.getName());
    }
    @Test
    void testCatSound2() {
        Cat cat1 = new Cat("Whitey");
        Cat cat2 = new Cat("Blackey");
        Assertions.assertEquals(cat1.makeSound(), cat2.makeSound());
        Assertions.assertEquals(cat2.makeSound(), cat1.makeSound());
    }

    @Test
    void testDogConstructor() {
        Assertions.assertDoesNotThrow(() -> new Dog("Bob"));
    }

    @Test
    void testDogName() {
        Dog dog = new Dog("Bob");
        Assertions.assertEquals("Bob", dog.getName());
    }
    @Test
    void testDogName2() {
        Dog dog1 = new Dog("Bob");
        Dog dog2 = new Dog("Sharik");
        Assertions.assertNotEquals(dog1.getName(), dog2.getName());
    }

    @Test
    void testDogSound1() {
        Dog dog = new Dog("Bob");
        Assertions.assertEquals("Wuf", dog.makeSound());
    }
    @Test
    void testDogSound2() {
        Dog dog1 = new Dog("Bob");
        Dog dog2 = new Dog("Sharik");
        Assertions.assertEquals(dog1.makeSound(), dog2.makeSound());
        Assertions.assertEquals(dog2.makeSound(), dog1.makeSound());
    }

    @Test
    void testSound() {
        Cat cat = new Cat("Whitey");
        Dog dog = new Dog("Bob");
        Assertions.assertNotEquals(cat.makeSound(), dog.makeSound());
    }
}
