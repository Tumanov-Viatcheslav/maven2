package myPet.pets;

public class Raven extends Pet {
    public Raven(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Caaar";
    }
}
