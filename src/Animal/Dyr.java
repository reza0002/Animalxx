package Animal;

// SUPERKLASSE

public class Dyr {
    String type;
    String navn;

    // Constructor
    public Dyr(String navn, String type) {
        this.navn = navn;
        this.type = type;
    }

    public String makeSound() {
        return ("Lyd");
    }

    // Methods
    public String toString() {
        return ("Type: " + type + "\n" + "Navn: " + navn);
    }
}
