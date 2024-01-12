package it.epicode.week1.progetto_settimana1;

import java.util.Scanner;

public class Esecuzione {


    public static void main(String[] args) {

        PlayerMultimediale[] arrayel = new PlayerMultimediale[5];

        Scanner input = new Scanner(System.in);

        int scelta;
        String titolo;

        System.out.println("Benvenuto nel mio lettore multimediale");


        for (int i = 0; i < arrayel.length; i++) {
            System.out.println("inserisci un numero per sceglie il tipo di elemento multimegliale: 1-Immagine; 2-Video; 3-audio");
            scelta = input.nextInt();
            if (scelta == 0 || scelta > 3){
                System.out.println("la scelta è errata, inserire un numero da 1 a 3");
            }
            System.out.println("inserisci il titolo dell'elemento");
            titolo = input.next();
            createEl(scelta, i, titolo, arrayel);
        }
        print(arrayel);




    }
        public static void createEl ( int scelta, int pos, String titolo, PlayerMultimediale[]arrayel){

            switch (scelta) {
                case 1:
                    arrayel[pos] = new Immagine(titolo);
                    break;
                case 2:
                    arrayel[pos] = new Video(titolo);
                    break;
                case 3:
                    arrayel[pos] = new Audio(titolo);
                default:
                    System.out.println("la scelta non è corretta");

            }
        }

        public static void print( PlayerMultimediale[] arrayel){
            for (int i =0; i< arrayel.length; i++){
                System.out.println(arrayel[i]);
            }
        }

}
