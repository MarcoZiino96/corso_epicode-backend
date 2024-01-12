package it.epicode.week1.progetto_settimana1;

public class Video extends PlayerMultimediale implements Riproducible{
    private int luminosita = 8;
    private int volume = 5;
    public Video(String titolo){
        super(titolo);
    }

    public int getVolume() {
        return volume;
    }

    public int getLuminosita() {
        return luminosita;
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

    public void alzaLuminosita(){

        if (luminosita ==10){
            System.out.println("Titolo:"+getTitolo()+": la luminosità è al massimo");
        }else{
            luminosita +=  1;
            System.out.println("Titolo:"+getTitolo()+": la luminosità  ora è a :" +  luminosita);
        }
    }

    public void abassaLuminosita(){
        if (luminosita == 0){
            System.out.println("Titolo:"+getTitolo()+": la luminosità è al minimo");
        } else{
            luminosita -= 1;
            System.out.println("Titolo:"+getTitolo()+": la luminosità ora è a :" +  luminosita);
        }
    }


    public void play() {

        String esclamativi ="";
        String asterisco =""
;
        for (int i =0; i < volume; i++){
            esclamativi += "!";
        }
        for (int a=0; a<luminosita;a++){
            asterisco += "*";
        }
        for (int j=0; j < durata; j++){
            System.out.println(getTitolo()+esclamativi+asterisco);
        }
    }


    public void execution() {
        play();
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Video{" +
                "titolo=" +getTitolo()+","+
                "durata="+durata+","+
                "luminosità=" + luminosita +","+
                ", volume=" + volume +"," +
                '}';
    }
}
