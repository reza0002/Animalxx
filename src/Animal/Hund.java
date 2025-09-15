package Animal;

public class Hund extends Dyr {
    public Hund (String navn, String type){
        super (navn, type);
    }

    public String makeSound(){
        return ("Vov, Vov, Vov!");
    }

    @Override
    public String toString(){
        return ("Type: " + type + "\n" + "navn: " + navn + "\n" + makeSound());
    }
}
