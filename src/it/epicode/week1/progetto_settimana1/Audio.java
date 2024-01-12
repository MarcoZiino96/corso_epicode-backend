package it.epicode.week1.progetto_settimana1;

public class Audio extends  PlayerMultimediale implements  Riproducible{
    private int volume = 8;
    public Audio (String titolo){
        super(titolo);
    }

    public int getVolume() {
        return volume;
    }

    public void play(){

        String esclamativi ="";

        for (int i =0; i < volume; i++){
            esclamativi += "!";
        }
        for (int j=0; j < durata; j++){
            System.out.println(getTitolo()+esclamativi);
        }
    }

    public void execution() {
        play();
    }

    public void alzaVolume() {
        if (volume ==10){
            System.out.println("Titolo:"+getTitolo()+": il volume è al massimo");
        }else{
            volume +=  1;
            System.out.println("Titolo:"+getTitolo()+": il volume ora è a :" +  volume);
        }
    }

    public void abassaVolume() {
        if (volume == 0){
            System.out.println("Titolo:"+getTitolo()+": il volume è al minimo");
        } else{
            volume -= 1;
            System.out.println("Titolo:"+getTitolo()+": il volume ora è a :" +  volume);
        }
    }


    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Audio{" +
                "titolo=" + getTitolo()+","+
                "volume=" + volume +","+
                "durata=" + durata+
                '}';
    }
}
