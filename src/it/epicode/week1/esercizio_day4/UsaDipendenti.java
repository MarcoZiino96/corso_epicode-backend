package it.epicode.week1.esercizio_day4;

public class UsaDipendenti {

    public static void main(String[] args) {
        Dipendente d1 = new Dipendente ("0/01", 1000, 7.5, TipoLivello.OPERAIO, TipoDipartimento.VENDITE);
        Dipendente d2 = new Dipendente("00/02", TipoDipartimento.PRODUZUIONE);
        Dipendente d3 = new Dipendente ("0/03", 1200, 7.5, TipoLivello.IMPIEGATO, TipoDipartimento.VENDITE);
        Dipendente d4 = new Dipendente("00/04", TipoDipartimento.PRODUZUIONE);




        System.out.println(Dipendente.calcolaPaga(d4));
        System.out.println(Dipendente.calcolaPaga(d4, 10));
        System.out.println(Dipendente.calcolaPaga(d3));
        System.out.println(Dipendente.calcolaPaga(d3, 10));

        d1.promuovi();

        d1.stampaDatiDipendente();
        d2.stampaDatiDipendente();
    }
}
