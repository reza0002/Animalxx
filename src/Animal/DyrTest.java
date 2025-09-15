package Animal;

import java.util.Scanner;

public class DyrTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til Dyrenes Beskyttelse!" + "\n-----------");
        System.out.println("Hvor mange dyr vil du indlevere?");
        int numberOfPets = scanner.nextInt();
        scanner.nextLine();

        Dyr[] dyr = new Dyr[numberOfPets];

        // Spørg om type på dyret
        for (int i = 0; i < numberOfPets; i++) {
            System.out.print("Hvilken type dyr ønsker du at indlevere?");
            String type = scanner.nextLine();

            System.out.print("Hvad er navnet på dyret?");
            String navn = scanner.nextLine();
            dyr[i] = new Dyr(type, navn);

        } System.out.print("---Dyr registret---");


    }
}
