package it.epicode.week1.progetto_settimana1;

public class Audio extends  PlayerMultimediale implements  Riproducible{
    private int volume = 8;
    public Audio (TipoTitolo titolo){
        super(titolo = titolo);
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


    public void alzaVolume(){
        if (volume >= 0 && volume<10){
           volume +=  1;
            System.out.println("Titolo:"+getTitolo()+": il volume ora è a :" +  volume);
        }else{
            System.out.println("Titolo:"+getTitolo()+": il volume è al massimo");

        }
    }

    public void abassaVolume(){
        if (volume <= 10 && volume > 0){
            volume -= 1;
            System.out.println("Titolo:"+getTitolo()+": il volume ora è a :" +  volume);
        } else{
            System.out.println("Titolo:"+getTitolo()+": il volume è al minimo");
        }
    }
}
