package Animal;

// SUPERKLASSE

public class Dyr {
    protected String type;
    protected String navn;

    // Constructor
    public Dyr(String navn, String type) {
        this.navn = navn;
        this.type = type;
    }

    // Methods
    public String makeSound() {
        return ("");
    }

    public String toString() {
        return ("Type: " + type + " " + makeSound() + "\n" + "Navn: " + navn);
    }
}
