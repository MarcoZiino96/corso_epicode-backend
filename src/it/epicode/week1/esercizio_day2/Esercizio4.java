package it.epicode.week1.esercizio_day2;

import java.util.Scanner;

public class Esercizio4 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa per suddividere le lettere con una virgola, per terminare inserisci ':q'");

        String string;

        do {
            System.out.println(string = scanner.next());

            if (string.equals(":q")){
                return;
            }
            String[] strgArr = string.split("");
            String result = String.join(",", strgArr);
            System.out.println(result);
        }while(!string.equals(":q"));
    }
}
