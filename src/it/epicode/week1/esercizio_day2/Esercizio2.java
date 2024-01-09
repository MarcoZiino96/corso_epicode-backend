package it.epicode.week1.esercizio_day2;

import java.util.Scanner;

public class Esercizio2{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci un anno in numero intero per sapere se è bisestile");
        int num = scanner.nextInt();
        boolean anno = annoBisestile(num);
        System.out.println(anno);
    }

    public static Boolean annoBisestile(int x){
        if (x % 4 == 0 || x % 100 == 0 && x % 400 == 0){
            return true;
        }else{
            return false;
        }
    }
}
