package it.epicode.week1.esercizio_day1;

import java.util.Scanner;

public class esercizio1 {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dammi un numero");
        int a = scanner.nextInt();
        System.out.println("Dammi un altro numero");
        int b = scanner.nextInt();
        System.out.println("Il prodotto è:");
        int prodotto = moltiplica(a, b);
        System.out.println(prodotto);


        System.out.println("Dammi una stringa");
        String c = scanner.next();
        scanner.nextLine();
        System.out.println("Dammi un numero");
        int d = scanner.nextInt();
        String parolaconcat = concat(c, d);
        System.out.println(parolaconcat);








    }

    public static int moltiplica(int a, int b){
        return a*b;
    }

    public static String concat(String c, int d){
        return c+d;
    }
}
