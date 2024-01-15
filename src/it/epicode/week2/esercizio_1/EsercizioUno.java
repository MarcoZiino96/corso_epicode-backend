package it.epicode.week2.esercizio_1;

import java.util.Scanner;

public class EsercizioUno {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        int[] array1 = creaArray();

        for (int i = 0; i < array1.length; i++) {

            System.out.println("Scrivi un numero da inserire nell'array ");

            int p = input.nextInt();

            do {
                System.out.println("inserisci un numero per scegliere l indice dell'array dove inserire il numero");
                 n = input.nextInt();

                if (n == 0 || n < 0 || n > 4){
                    System.out.println("la scelta è errata, inserire un numero da 1 a 5");
                }
            }while (n == 0 || n < 0 && n > 4);

        }




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

    public static void modificaArray(int p, int n, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[n] = p;
            System.out.println(array[i]);
        }
    }
}
