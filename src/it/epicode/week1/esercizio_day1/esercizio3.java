package it.epicode.week1.esercizio_day1;
import java.util.Scanner;

public class esercizio3 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la base del rettangolo");
        double b = scanner.nextDouble();
        System.out.println("Inserisci l'altezza del rettangolo");
        double h = scanner.nextDouble();
        System.out.print("Il perimetro del rettangolo è: ");
        System.out.println(perRettangolo(b, h));

        System.out.println("Inserisciun numero: Se è pari apparirà 0, altrimenti 1");
        double num = scanner.nextDouble();
        System.out.println(pariOdispari(num));




    }





    public static double perRettangolo (double x, double y){
        return (x+y)*2;
    }

    public static double pariOdispari (double x){

        if((x % 2)== 0){
            return 0;
        }else return 1;
    }


}
