package lotto_simulator;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class lottoSimulator {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        userNumbers();
        randomNumbers();
    }

    public static void lottoGenerator() {


    }

    public static void randomNumbers() {
        Random r = new Random();
        System.out.println("Komputer losuje 6 liczb od 0 do 49:");

        int[] allNumbers = new int[49];
        int[] randomNumbers = new int[6];

        for (int i = 0; i < allNumbers.length; i++) { //wypełniam tablicę liczbami od 1 do 49
            allNumbers[i] = 1 + i;
        }

        int i = 0; //indeks w małej tablicy (tej, którą będę zapełniać 6 kolejnymi liczbami)
        for (int j = 0; j < 6; j++) { //losuję 6 liczb z wcześniej tworzonej tablicy +
            i = r.nextInt(49 - j);
            randomNumbers[j] = allNumbers[i];
            allNumbers[i] = allNumbers[allNumbers.length - j - 1];// + przesuwam wylosowaną liczbę na ostatni indeks z dużej tablicy
        }                                                          // i dalej losuję już w mniejszej tablicy (bo na ostatni indeks wrzciłam przed chwilą wylosowaną liczbę)
        //dzięki temu am pewność, że te liczby się nigdy nie powtórzą

        sort(randomNumbers);
        System.out.println(Arrays.toString(randomNumbers));
    }


    public static void userNumbers () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 6 losowych liczb od 0 do 49");
        /*int userNr1 = scanner.nextInt();
        int userNr2 = scanner.nextInt();
        int userNr3 = scanner.nextInt();
        int userNr4 = scanner.nextInt();
        int userNr5 = scanner.nextInt();
        int userNr6 = scanner.nextInt();
        */


        int[] userArray = new int[6];

        int userNumber = scanner.nextInt();
        int nextNumber = 0;

            try {
                if (userNumber > 0 && userNumber < 50) {

                    while (true) {
                        if (nextNumber != userNumber) {

                            for (int i = 0; i < 6; i++) {
                                userNumber = scanner.nextInt();
                                userArray[i] = userNumber;

                            }
                            nextNumber = userNumber;

                        } else {
                            System.out.println("Ta liczba została już podana, podaj inną liczbę: ");
                            userNumbers();
                        }
                    }
                } else {
                    System.out.println("Podaj liczbę z zakresu 1-49.");
                    userNumbers();
                }
            } catch (InputMismatchException e){
                System.out.println("To nie jest liczba! \n Podaj liczbę z zakresu 1-49.");
                userNumbers();
            }




        //userArray = new int[]{userNr1, userNr2, userNr3, userNr4, userNr5, userNr6};
        sort(userArray);
        System.out.println(Arrays.toString(userArray));

    }

    public static int isInRange (int userNumberInRange) {
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if (userNumber > 0 && userNumber < 50) {
            userNumber =
        } else {
            System.out.println("Podaj liczbę z zakresu 1-49.");
            userNumbers();
        }



    }








}
