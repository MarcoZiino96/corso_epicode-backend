package it.epicode.week1.esercizio_day4;

public class GestioneDipendenti {

    public static void main(String[] args) {
        Dipendente d1 = new Dipendente(1000,"00/03",1000, 8, TipoLivello.OPERAIO, TipoDipartimento.PRODUZUIONE);
        Dipendente d2 = new Dipendente(1000,"00/03",1000, 8, TipoLivello.OPERAIO, TipoDipartimento.PRODUZUIONE);
        Dipendente d3 = new Dipendente(1000,"00/03",1200, 8, TipoLivello.IMPIEGATO, TipoDipartimento.AMMINISTRAZIONE);
        Dipendente d4 = new Dipendente(1000,"00/03",2000, 8, TipoLivello.DIRIGENTE, TipoDipartimento.PRODUZUIONE);

        d1.promuovi();
        d3.promuovi();
        d4.promuovi();

        d1.stampaDatiDipendente();
        d2.stampaDatiDipendente();
        d3.stampaDatiDipendente();
        d4.stampaDatiDipendente();

    }
}
