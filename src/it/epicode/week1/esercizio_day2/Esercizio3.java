package it.epicode.week1.esercizio_day2;

import java.util.Scanner;

public class Esercizio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero compreso tra 0 e 3");

        int x = scanner.nextInt();

        switch (x){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("Errore:il numero deve essere compreso tra 0 e 3");
        }
}
}
