package Animal;

import java.util.Scanner;

// Main class
public class DyrTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Velkomstbesked og spørger hvor mange dyr der skal indleveres
        System.out.println("Velkommen til Dyrenes Beskyttelse!" + "\n-----------");
        System.out.println("Hvor mange dyr vil du indlevere?");
        int numberOfPets = scanner.nextInt();
        scanner.nextLine();

        // Opretter et array til at holde dyrene
        Dyr[] dyr = new Dyr[numberOfPets];

        // Spørger om data på hvert dyr og gemmer dem i arrayet
        for (int i = 0; i < numberOfPets; i++) {
            System.out.print("Hvilken type dyr ønsker du at indlevere? \n");
            String type = scanner.nextLine();

            System.out.print("Hvad er navnet på dyret? \n");
            String navn = scanner.nextLine();

            if (type.equalsIgnoreCase("Kat")) {
                dyr[i] = new Kat(navn, type);
            } else if (type.equalsIgnoreCase("Hund")) {
                dyr[i] = new Hund(navn, type);
            } else if (type.equalsIgnoreCase("Lizard")) {
                dyr[i] = new Lizard(navn, type);
            } else {
                System.out.println("Ukendt dyretype. Registrerer som generisk dyr.");
                dyr[i] = new Dyr(navn, type);
            }
        }

        System.out.println("Tak for din indlevering! Her er en oversigt over de dyr, du har indleveret:\n");
        scanner.close();

        // Printer alle dyr som er indleveret
        System.out.println("---- Dyr registret ----");
        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("Registreret dyr nr: " + (i + 1) + "\n" + dyr[i] + "\n");
        }
    }
}
