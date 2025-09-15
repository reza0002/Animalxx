package Animal;

public class Kat extends Dyr{

    public Kat (String navn, String type) {
        super(navn ,type);
    }

    public String makeSound() {
        return (" (Meow!)");
    }

    @Override
    public String toString() {
        return ("Type: " + type + "\n" + "Navn: " + navn + makeSound());
    }
}
