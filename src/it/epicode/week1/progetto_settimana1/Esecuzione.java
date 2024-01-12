package it.epicode.week1.progetto_settimana1;

public class Esecuzione {

    public static void main(String[] args) {

        Audio audio = new Audio(TipoTitolo.AUDIO);

        audio.abassaVolume();
        audio.play();
    }
}
