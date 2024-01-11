package it.epicode.week1.esercizio_day4;

public class GestioneDipendenti {

    public static void main(String[] args) {

        double somma = 0;
        Dipendente[] dipendenti = new Dipendente[4];

        dipendenti[0] = new Dipendente( "00/03", 1000, 8, TipoLivello.OPERAIO, TipoDipartimento.PRODUZUIONE);
        dipendenti[1] = new Dipendente( "00/03", 1000, 8, TipoLivello.OPERAIO, TipoDipartimento.PRODUZUIONE);
        dipendenti[2]= new Dipendente("00/03", 1200, 8, TipoLivello.IMPIEGATO, TipoDipartimento.AMMINISTRAZIONE);
        dipendenti[3] = new Dipendente( "00/03", 2000, 8, TipoLivello.DIRIGENTE, TipoDipartimento.PRODUZUIONE);

        dipendenti[0].promuovi();
        dipendenti[2].promuovi();
        dipendenti[3].promuovi();



        int i;
        for (i = 0; i < dipendenti.length; i++) {
            dipendenti[i].stampaDatiDipendente();
        }

        for (i=0; i < dipendenti.length;i++){

             somma += Dipendente.calcolaPaga(dipendenti[i], 5);

        }
        System.out.println(somma);
    }
}