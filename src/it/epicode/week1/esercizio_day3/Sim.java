package it.epicode.week1.esercizio_day3;

public class Sim {

    private int numeroTelefono;
    private double creditoResiduo;
    private double costoMinuto;
    private String[] registroChiamate = new String[5];

    private int chiamateDisponibili;

    public Sim(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.creditoResiduo = 0;
        this.costoMinuto = 0.20;

    }

    public double getCredit() {
        return creditoResiduo;
    }

    public double getCostoMinuto(){
        return costoMinuto;
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
        this.creditoResiduo = n;
    }


    public void ricarica(int n) {
        if (n >= 5) {
            creditoResiduo += n;
        } else {
            System.out.println("La ricarica deve essere di almeno 5 €");
        }
    }

    public void info() {
        System.out.println("Il numero di telefono è" + numeroTelefono);
        System.out.println("il tuo credito è di:" + creditoResiduo);
        System.out.println("Le tue ultime 5 chiamate:" + registroChiamate);
    }

    public void stampaDatiSim(){
        System.out.println("Numero: " + numeroTelefono + ", costo al minuto: " + costoMinuto + ", credito: " + creditoResiduo);

        System.out.println("Ultime 5 chiamate effettuate:");
        for (int i = 0; i < registroChiamate.length; i++) {
            System.out.println(registroChiamate[i]);
        }
    }

    public boolean telefonata(double min, int tel) {

        double costoChiamata = min * getCostoMinuto();
        if ( costoChiamata >= creditoResiduo){
            return false;
        }else{
            String datiChiamata = "Numero chiamato: " + tel + ", secondi di conversazione: " + min;
            if (chiamateDisponibili>0){
                registroChiamate[5-chiamateDisponibili]=datiChiamata;
                chiamateDisponibili--;
            }else{
                shiftArray(datiChiamata);
            }
            return  true;
        }

    }

   private void shiftArray(String datiChiamata){
        int i;
        for (i=0;i<registroChiamate.length-1;i++){
            registroChiamate[i]=registroChiamate[i+1];
        }
        registroChiamate[i]=datiChiamata;
   }
}
