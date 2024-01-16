package it.epicode.week2.esercizio_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class esercizioUno {

    public static void main(String[] args) {
        creaArrayHasSet();
    }

    public static void  creaArrayHasSet(){
        HashSet<String> inputStringHasSet = new HashSet<>();
        ArrayList<String> duplicateParole = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Scrivi un numero di quante parola vuoi inserire");
        int i = input.nextInt();




        for (int j=0; j<i;j++){
            System.out.println("inserisci una parola");
            String parola = input.nextLine();
            if(!inputStringHasSet.contains(parola)){
                duplicateParole.add(parola);

            } else if (!inputStringHasSet.contains(parola)) {
                inputStringHasSet.add(parola);
            }
            {
                inputStringHasSet.add(parola);
            }
        }

        System.out.println(duplicateParole);
        System.out.println(inputStringHasSet.size());
        System.out.println(inputStringHasSet);
    }
}
