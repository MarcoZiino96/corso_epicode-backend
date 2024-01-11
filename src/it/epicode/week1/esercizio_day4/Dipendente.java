package it.epicode.week1.esercizio_day4;

public class Dipendente {

    public final static double stipendioBase = 1000;
    private String matricola;

    private double stipendio;
    private double importoOrarioStraordinario;
    private TipoLivello livello;
    private TipoDipartimento dipartimento;

    public Dipendente( String matricola, double stipendio, double importoOrarioStraordinario, TipoLivello livello, TipoDipartimento dipartimento) {


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
        this.importoOrarioStraordinario = 30;
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
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "stipendioBase=" + stipendioBase +
                ", matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                '}';
    }

    public TipoLivello promuovi() {

        switch (livello) {

            case OPERAIO:
                livello = TipoLivello.IMPIEGATO;
                stipendio = stipendioBase * 1.2;
                return livello;
            case IMPIEGATO:
                livello = TipoLivello.QUADRO;
                stipendio = stipendioBase * 1.5;
                return livello;
            case QUADRO:
                livello = TipoLivello.DIRIGENTE;
                stipendio = stipendioBase * 2;
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



