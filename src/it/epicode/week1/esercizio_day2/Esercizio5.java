package it.epicode.week1.esercizio_day2;

import java.util.Scanner;

public class Esercizio5 {

    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un nemero intero:");
        int x = scanner.nextInt();
        for (int i =x; i>=0; i--){
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
}
