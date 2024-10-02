package myPet;

import myPet.pets.Cat;
import myPet.pets.Dog;
import myPet.pets.Pet;
import myPet.pets.Raven;

public class Main {

    public static Pet[] createThreePetsArray() {
        Pet[] pets = new Pet[3];
        pets[0] = new Cat("CatName");
        pets[1] = new Dog("DogName");
        pets[2] = new Raven("RavenName");
        return pets;
    }

    public static String[] makePetsSounds(Pet[] pets) throws IllegalArgumentException{
        if (pets == null)
            throw new IllegalArgumentException("Expected array, got null");
        if (pets.length == 0)
            throw new IllegalArgumentException("Expected array to not be empty");
        String[] sounds = new String[pets.length];
        for (int i = 0; i < pets.length; i++) {
            sounds[i] = pets[i].makeSound();
        }
        return sounds;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}