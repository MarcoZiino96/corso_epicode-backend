package it.epicode.week1.progetto_settimana1;

 public abstract class PlayerMultimediale{

     private TipoTitolo titolo;

     public PlayerMultimediale(TipoTitolo titolo){
         this.titolo = titolo;
     }


     public TipoTitolo getTitolo(){
         return titolo;
     }

 }
