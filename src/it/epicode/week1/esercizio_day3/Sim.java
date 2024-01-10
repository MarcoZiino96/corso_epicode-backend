package it.epicode.week1.esercizio_day3;

public class Sim {

    private int numeroTelefono;
    private double creditoResiduo;
    private double costoMinuto;
    private String[] registroChiamate = new String[5];

    public Sim(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.creditoResiduo = 0;
        this.costoMinuto = 0.20;
        //  this.registroChiamate = String[5];

    }

    public double getCredit() {
        return creditoResiduo;
    }

    public double getNumber() {
        return numeroTelefono;
    }

    public String[] getRegister() {
        return registroChiamate;
    }

    public double getPrice() {
        return costoMinuto;
    }

    public void setCredit(int n) {
        if (n >= 5) {
            creditoResiduo += n;
        } else {
            System.out.println("La ricarica deve essere di almeno 5 €");
        }
    }


    public void ricarica(int n) {
        creditoResiduo += n;
    }

    public void info() {
        System.out.println("Il numero di telefono è" + numeroTelefono);
        System.out.println("il tuo credito è di:" + creditoResiduo);
        System.out.println("Le tue ultime 5 chiamate:" + registroChiamate);
    }

    public boolean telefonata(double min, int tel) {
        if (getCredit() > 0.20) {

        }
    }
}
