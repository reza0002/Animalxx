package Animal;

public class Kat extends Dyr{
    public Kat (String navn, String type) {
        super(navn ,type);
    }

    @Override
    public String makeSound() {
        return ("(Meow!)");
    }

    public String toString() {
        return ("Type: " + type + " " + makeSound() + "\n" + "Navn: " + navn);
    }
}
