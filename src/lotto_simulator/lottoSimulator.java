package lotto_simulator;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class lottoSimulator {

    public static void main (String [] args) {
        lottoGenerator();
    }

    public static void lottoGenerator() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 6 losowych liczb od 0 do 49");
        int userNr1 = scanner.nextInt();
        int userNr2 = scanner.nextInt();
        int userNr3 = scanner.nextInt();
        int userNr4 = scanner.nextInt();
        int userNr5 = scanner.nextInt();
        int userNr6 = scanner.nextInt();

        int [] userArray = new int [6];
        userArray = new int [] {userNr1, userNr2, userNr3, userNr4, userNr5, userNr6};
        sort(userArray);
        System.out.println(Arrays.toString(userArray));

        int numberCount = 0;
        Random r = new Random();
        System.out.println("Komputer losuje 6 liczb od 0 do 49:");
        int r1;

        r1 = 1 + r.nextInt(50);

        int [] allNumbers = new int[49];
        int [] randomNumbers = new int[6];

        for(int i = 0; i < allNumbers.length; i++) {
            allNumbers[i] = 1 + i;
        }
        System.out.println(Arrays.toString(allNumbers));

        int i = 0;

        for (int j = 0; j < 6; j++){
            i = r.nextInt(49 - j);
            randomNumbers[j] = allNumbers[i];
            allNumbers[i] = allNumbers[allNumbers.length - j - 1];
        }

        sort(randomNumbers);

        System.out.println(Arrays.toString(randomNumbers));







    }


}
