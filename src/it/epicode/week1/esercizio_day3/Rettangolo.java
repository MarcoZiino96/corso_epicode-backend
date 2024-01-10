package it.epicode.week1.esercizio_day3;

public class Rettangolo {

    private double larghezza;
    private double altezza;

    public Rettangolo(double larghezza, double altezza){
        this.larghezza = larghezza;
        this.altezza = altezza;
    }
    public double getLarghezza(){
        return larghezza;
    }

    public double getAltezza(){
        return altezza;
    }

    public static double perimetro(double x, double y){
        return (x+y)*2;
    }

    public static double area(double x, double y){
        return (x*y);
    }
}
