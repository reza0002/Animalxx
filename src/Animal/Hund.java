package Animal;

public class Hund extends Dyr {
    public Hund (String navn, String type){
        super (navn, type);
    }

    @Override
    public String makeSound(){
        return ("(Vov, Vov, Vov!)");
    }

    public String toString(){
        return ("Type: " + type + " " + makeSound() + "\n" + "navn: " + navn + "\n");
    }
}
