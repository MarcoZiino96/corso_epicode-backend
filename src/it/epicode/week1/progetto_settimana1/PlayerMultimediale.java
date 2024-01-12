package it.epicode.week1.progetto_settimana1;

 public abstract class PlayerMultimediale{

     private String titolo;

     public PlayerMultimediale(String titolo){
         this.titolo = titolo;
     }

     public String getTitolo(){
         return titolo;
     }


     public abstract void print();

     public abstract void execution();

 }
