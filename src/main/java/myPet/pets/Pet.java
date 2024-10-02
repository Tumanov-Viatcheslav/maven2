package myPet.pets;

public abstract class Pet {
    private String name;

    public String getName() {
        return name;
    }

    public Pet(String name) {
        this.name = name;
    }

    public abstract String makeSound();
}
