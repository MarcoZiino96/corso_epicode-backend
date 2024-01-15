package it.epicode.week2.esercizio_1;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.util.Scanner;
public class EsercizioUno {

    private static final  Logger logger = LoggerFactory.getLogger("esercizio1");
    public static void main(String[] args) {

        int[] array1 = creaArray();

        modificaArray(array1);

    }

    public static int[] creaArray() {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            double doubleRandom = (Math.random() * 10) + 1;
            int intRandom = (int) doubleRandom;
            array[i] = intRandom;
            System.out.println(array[i]);
        }

        return array;
    }

    public static void modificaArray(int[] array) {

        Scanner input = new Scanner(System.in);

        int n;
        int p;
        final int exit = 0;

        do {
            System.out.println("Inserisci un numero per sovrascrivere l array");
            n = input.nextInt();
            if ( n == 0){
                System.out.println("Sei uscito dal menu inserimento");
                continue;
            }
            try {
                System.out.println("Inserisci la posizione dell'array in cui inserirlo, le scelte sono da 1-5, 0 per uscire");
                p = input.nextInt();
                array[p- 1] = n;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                logger.error("Indice non presente nell'array");
                modificaArray(array);
            }
            for (int i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }
        } while (n  != exit);

        }
}

