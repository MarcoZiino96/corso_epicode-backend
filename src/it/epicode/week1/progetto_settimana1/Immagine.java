package it.epicode.week1.progetto_settimana1;

public class Immagine extends PlayerMultimediale{

    private int luminosita = 5;
    public Immagine(String titolo){
        super(titolo);
    }

    public int getLuminosita() {
        return luminosita;
    }

    private void show(){
        String asterisco = "";
        for (int i =0; i<luminosita;i++){
            asterisco += "*";
        }
        System.out.println(getTitolo()+asterisco);
    }

    @Override
    public void execution() {
        show();
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

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Immagine{" +
                "titolo="+getTitolo()+","+
                "luminosita=" + luminosita +","+
                '}';
    }
}
