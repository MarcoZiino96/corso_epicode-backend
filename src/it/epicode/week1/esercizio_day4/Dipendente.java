package it.epicode.week1.esercizio_day4;

public class Dipendente {

    private double stipendioBase = 1000;
    private String matricola;

    private double stipendio;
    private double importoOrarioStraordinario;
    private TipoLivello livello;
    private TipoDipartimento dipartimento;

    public Dipendente(double stipendioBase, String matricola, double stipendio, double importoOrarioStraordinario, TipoLivello livello, TipoDipartimento dipartimento) {

        this.stipendioBase = stipendioBase;
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    public Dipendente(String matricola, TipoDipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = TipoLivello.OPERAIO;
    }


    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public TipoDipartimento getDipartimento() {
        return dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public TipoLivello getLivello() {
        return livello;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public void setDipartimento(TipoDipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void stampaDatiDipendente() {
        System.out.println("Stipendio:" + stipendioBase);
        System.out.println("Matricola:" + matricola);
        System.out.println("Importo orario straordinario:" + importoOrarioStraordinario);
        System.out.println("Livello" + livello);
        System.out.println("Dipartimento:" + dipartimento);
    }

    public TipoLivello promuovi() {

        switch (livello) {

            case OPERAIO:
                livello = TipoLivello.IMPIEGATO;
                stipendioBase = stipendioBase * 1.2;
                return livello;
            case IMPIEGATO:
                livello = TipoLivello.QUADRO;
                stipendioBase = stipendioBase * 1.5;
                return livello;
            case QUADRO:
                livello = TipoLivello.DIRIGENTE;
                stipendioBase = stipendioBase * 2;
                return livello;
            case DIRIGENTE:
                System.out.println("Sei gia al livello massimo,non puoi essere promosso");
            default:{
                return livello;
            }
        }
    }

    public static double calcolaPaga(Dipendente d1){

        return d1.stipendio;
    }

    public static double calcolaPaga(Dipendente d1, int extra){

        return d1.stipendio += d1.importoOrarioStraordinario * extra;
    }
}



