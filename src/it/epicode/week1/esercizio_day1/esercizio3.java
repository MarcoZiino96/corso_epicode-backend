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

        System.out.println("inserisci il primo lato del trinagolo");
        double l1 = scanner.nextDouble();
        System.out.println("inserisci il secondo lato del trinagolo");
        double l2 = scanner.nextDouble();
        System.out.println("inserisci il terzo lato del trinagolo");
        double l3 = scanner.nextDouble();
        System.out.println("L'area del trinagolo è:");
        System.out.println(areaTriangolo(l1,l2,l3));
    }

    // come calcolare il perimetro di un rettangolo
    public static double perRettangolo (double x, double y){
        return (x+y)*2;
    }

    // come verificare se un numero inserito è pari o dispari
    public static double pariOdispari (double x){

        if((x % 2)== 0){
            return 0;
        }else return 1;
    }

    //come calcolare l'area di un triangolo con la formula di erone
    public static double areaTriangolo (double x, double y, double z){
        double sp = (x+y+z)/2;
        double area = sp*(sp-x)*(sp-y)*(sp-z);
        return Math.sqrt(area);
    }
}
