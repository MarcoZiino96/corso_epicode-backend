package it.epicode.week1.progetto_settimana1;

import java.util.Scanner;

public class Esecuzione{


    public static void main(String[] args) {

        // prova metodi delle sottoclassi

        Immagine img = new Immagine("sole splendente");
        img.print();
        img.abassaLuminosita();
        img.alzaLuminosita();

        Audio audio = new Audio("vocale");
        audio.abassaVolume();
        audio.alzaVolume();
        audio.print();

        Video video = new Video("corso epicode");

        video.alzaLuminosita();
        video.abassaLuminosita();
        video.alzaVolume();
        video.abassaVolume();
        video.print();



        PlayerMultimediale[] arrayel = new PlayerMultimediale[5];

        Scanner input = new Scanner(System.in);

        int scelta;
        String titolo;

        System.out.println("Benvenuto nel mio lettore multimediale");


        for (int i = 0; i < arrayel.length; i++) {

            do {
            System.out.println("inserisci un numero per sceglie il tipo di elemento multimegliale: 1-Immagine; 2-Video; 3-audio");
            scelta = input.nextInt();

            if (scelta == 0 || scelta > 3){
                System.out.println("la scelta è errata, inserire un numero da 1 a 3");
             }
            }while (scelta == 0 || scelta > 3);

            System.out.println("inserisci il titolo dell'elemento");
            input.nextLine();
            titolo = input.nextLine();
            createEl(scelta, i, titolo, arrayel);
        }
        print(arrayel);

        System.out.println("Inserisci un numero da 1 a 5 per eseguire il file Multimediale 0 zero per uscire");

        for (int j=0; j< arrayel.length;j++){
            int selected = input.nextInt();
            if (selected == 0){
                return;
            }else{
                selected = selected -1;
                arrayel[selected].execution();
            }
        }

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
                    break;

            }
        }

        public static void print( PlayerMultimediale[] arrayel){
            for (int i =0; i< arrayel.length; i++){
                System.out.println(arrayel[i]);
            }
        }

}
