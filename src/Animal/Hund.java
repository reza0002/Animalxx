package Animal;

public class Hund extends Dyr {
    public Hund (String navn, String type){
        super (navn, type);
    }

    @Override
    public void makeSound(){
        System.out.println(navn + "Vov, Vov, Vov!");
    }
}
