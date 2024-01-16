package it.epicode.week2.esercizio_1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Esercizio2 {
    private static final Logger logger = LoggerFactory.getLogger("esercizio2");
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci i km percorsi");

        int km = input.nextInt();

        System.out.println("Inserisci i litri consumati");
        int l = input.nextInt();

        try{
            System.out.println("rapporto km per litro");
            System.out.println(km/l);
        }catch (ArithmeticException e){
            logger.error("é stata effetuata una divisone per 0");
        }
        if (l == 0){
            System.out.println("non puoi inserire zero");
        }



    }
}
