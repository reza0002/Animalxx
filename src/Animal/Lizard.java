package Animal;

public class Lizard extends Dyr{
    public Lizard (String navn, String type){
        super(navn ,type);
    }

    @Override
    public String makeSound() {
       return("(SSSSssssSSSSssss!)");
    }

    public String toString(){
        return ("Type: " + type + " " + makeSound() + "\n" + "Navn: " + navn);
    }
}
