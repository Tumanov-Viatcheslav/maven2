import myPet.pets.Cat;
import myPet.pets.Dog;
import myPet.pets.Pet;
import myPet.pets.Raven;
import myPet.Main;
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
    void testRavenConstructor() {
        Assertions.assertDoesNotThrow(() -> new Raven("Wise"));
    }

    @Test
    void testRavenName() {
        Raven raven = new Raven("Wise");
        Assertions.assertEquals("Wise", raven.getName());
    }
    @Test
    void testRavenName2() {
        Raven raven1 = new Raven("Wise");
        Raven raven2 = new Raven("Smart");
        Assertions.assertNotEquals(raven1.getName(), raven2.getName());
    }

    @Test
    void testRavenSound1() {
        Raven raven = new Raven("Wise");
        Assertions.assertEquals("Caaar", raven.makeSound());
    }
    @Test
    void testRavenSound2() {
        Raven raven1 = new Raven("Wise");
        Raven raven2 = new Raven("Smart");
        Assertions.assertEquals(raven1.makeSound(), raven2.makeSound());
        Assertions.assertEquals(raven2.makeSound(), raven1.makeSound());
    }

    @Test
    void testSound() {
        Cat cat = new Cat("Whitey");
        Dog dog = new Dog("Bob");
        Raven raven = new Raven("Wise");
        Assertions.assertNotEquals(cat.makeSound(), dog.makeSound());
        Assertions.assertNotEquals(cat.makeSound(), raven.makeSound());
        Assertions.assertNotEquals(dog.makeSound(), cat.makeSound());
        Assertions.assertNotEquals(dog.makeSound(), raven.makeSound());
        Assertions.assertNotEquals(raven.makeSound(), cat.makeSound());
        Assertions.assertNotEquals(raven.makeSound(), dog.makeSound());
    }

    @Test
    void testCreateThreePetsArray1() {
        Assertions.assertDoesNotThrow(Main::createThreePetsArray);
    }
    @Test
    void testCreateThreePetsArray2() {
        Pet[] pets = Main.createThreePetsArray();
        Assertions.assertNotNull(pets);
    }
    @Test
    void testCreateThreePetsArray3() {
        Pet[] pets = Main.createThreePetsArray();
        Assertions.assertEquals(3, pets.length);
    }
    @Test
    void testCreateThreePetsArray4() {
        Pet[] pets = Main.createThreePetsArray();
        Assertions.assertNotNull(pets[0]);
        Assertions.assertNotNull(pets[1]);
        Assertions.assertNotNull(pets[2]);
    }

    @Test
    void testMakePetsSounds1() {
        Pet[] pets = Main.createThreePetsArray();
        Assertions.assertDoesNotThrow(() -> Main.makePetsSounds(pets));
    }
    @Test
    void testMakePetsSounds2() {
        Pet[] pets = null;
        IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, () -> Main.makePetsSounds(pets));
        Assertions.assertEquals("Expected array, got null", ex.getMessage());
    }
    @Test
    void testMakePetsSounds3() {
        Pet[] pets = new Pet[0];
        IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, () -> Main.makePetsSounds(pets));
        Assertions.assertEquals("Expected array to not be empty", ex.getMessage());
    }
    @Test
    void testMakePetsSounds4() {
        Pet[] pets = Main.createThreePetsArray();
        String[] sounds = Main.makePetsSounds(pets);
        Assertions.assertNotNull(sounds);
    }
    @Test
    void testMakePetsSounds5() {
        Pet[] pets = Main.createThreePetsArray();
        String[] sounds = Main.makePetsSounds(pets);
        Assertions.assertEquals(sounds.length, pets.length);
    }
    @Test
    void testMakePetsSounds6() {
        Pet[] pets = Main.createThreePetsArray();
        String[] sounds = Main.makePetsSounds(pets);
        for (String sound : sounds) {
            Assertions.assertNotNull(sound);
        }
    }
    @Test
    void testMakePetsSounds7() {
        Pet[] pets = Main.createThreePetsArray();
        String[] sounds = Main.makePetsSounds(pets);
        for (int i = 0; i < sounds.length; i++) {
            Assertions.assertEquals(pets[i].makeSound(), sounds[i]);
        }
    }
}
