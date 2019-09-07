package guess_a_number;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessAnumber {

    public static void main(String[] args) {
        randomNumber();
    }

    private static void randomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        System.out.println("Zgadnij liczbę: ");

        try {
            Scanner scanner = new Scanner(System.in);
            boolean isAdigit = scanner.hasNextInt();
            int userNumber = scanner.nextInt();

            if (isAdigit) {
                while (randomNumber != userNumber) {

                    if (userNumber > randomNumber) {
                        System.out.println("Za dużo!");
                    } else {
                        System.out.println("Za mało!");
                    }
                    userNumber = scanner.nextInt();
                }
                System.out.println("Zgadłeś!");

            } else {
                System.out.println("To nie jest liczba!");
                randomNumber();
            }

        } catch (InputMismatchException e) {
            System.out.println("To nie jest liczba!");
            randomNumber();
        }
    }
}