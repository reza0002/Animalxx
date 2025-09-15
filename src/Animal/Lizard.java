package Animal;

public class Lizard extends Dyr{

    public Lizard (String navn, String type){
        super(navn ,type);
    }
    public String makeSound() {
       return("sssss");
    }

    @Override
    public String toString(){
        return ("Type" + type + "\n" + "Navn" + navn + makeSound());


    }


}
