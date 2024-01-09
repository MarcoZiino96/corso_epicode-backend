package it.epicode.week1.esercizio_day2;

import java.util.Scanner;

public class Escercizio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci una stringa");
        String strng = scanner.next();
        boolean num = pariDispari(strng);
        System.out.println(num);

    }

    public static boolean pariDispari(String strg){
        if(strg.length() % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
