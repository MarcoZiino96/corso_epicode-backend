package it.epicode.week1.esercizio_day4;

public class UsaDipendenti {

    public static void main(String[] args) {
        Dipendente d1 = new Dipendente (1000,"0/01", 1000, 7.5, TipoLivello.OPERAIO, TipoDipartimento.VENDITE);
        Dipendente d2 = new Dipendente("00/02", TipoDipartimento.PRODUZUIONE);
        System.out.println(Dipendente.calcolaPaga(d1));
        System.out.println(Dipendente.calcolaPaga(d1, 10));
        d1.promuovi();

        d1.stampaDatiDipendente();
        d2.stampaDatiDipendente();
    }
}
