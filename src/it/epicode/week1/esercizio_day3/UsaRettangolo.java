package it.epicode.week1.esercizio_day3;

import java.util.Scanner;

public class UsaRettangolo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CREA UN RETTANGOLO");
        System.out.println("Dammi l'altezza del rettangolo");
        double height = scanner.nextDouble();
        System.out.println("Dammi la larghezza del rettangolo");
        double width = scanner.nextDouble();
        Rettangolo r1 = new Rettangolo(height, width);
        System.out.println("Il tuo rettangolo è stato creato");
        System.out.println("altezza:" + height +"cm" + ", larghezza" + width);
        stampaRettangolo(r1.getAltezza(), r1.getLarghezza());

        System.out.println("CREA UN ALTRO RETTANGOLO");
        System.out.println("Dammi l'altezza del rettangolo");
        double height2 = scanner.nextDouble();
        System.out.println("Dammi la larghezza del rettangolo");
        double width2 = scanner.nextDouble();
        Rettangolo r2 = new Rettangolo(height2, width2);
        System.out.println("Il tuo rettangolo è stato creato");
        System.out.println("altezza:" + height2 + "cm" + ", larghezza" + width2);
        stampaRettangolo(r2.getLarghezza(), r2.getAltezza());

        System.out.println("La somma dell'area e del perimetro dei due rettangoli è:");

        stampa2Rttangoli(r1, r2);







    }

    public static void stampaRettangolo(double h, double a){
        double per = Rettangolo.perimetro(h, a);
        System.out.println("Il perimetro rettangolo è di:"+ per + "cm");
        double area = Rettangolo.area(h, a);
        System.out.println("L'area rettangolo è di:"+ area + "cm");
    }

    public static void stampa2Rttangoli(Rettangolo r1, Rettangolo r2){
        double sommaPerimetro = Rettangolo.perimetro((r1.getLarghezza()), r1.getAltezza()) + Rettangolo.perimetro((r2.getLarghezza()), r2.getAltezza());
        double sommaArea = Rettangolo.area((r1.getLarghezza()), r1.getAltezza()) + Rettangolo.perimetro((r2.getLarghezza()), r2.getAltezza());
        System.out.println("La somma del perimetro dei due rettangoli è:" + sommaPerimetro + "cm");
        System.out.println("La somma dell'area dei due rettangoli è:" + sommaArea + "cm");
    }
}
