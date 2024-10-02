import myPet.pets.Cat;
import myPet.pets.Dog;
import myPet.pets.Pet;
import myPet.pets.Raven;
import myPet.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPets {


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
