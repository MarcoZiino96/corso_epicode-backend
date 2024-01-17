package it.epicode.week2.esercizio_2;

import java.util.HashMap;
import java.util.Set;

public class RubricaTelefonica {

    public static void main(String[] args) {

        insertKey("marco", "3275496789");
        insertKey("alessio", "3275496555");
        insertKey("ciccio", "3275496777");

        System.out.println(getRubrica());

        System.out.println(searchWhithvalue("ciccio"));

    }

    public static HashMap<String, String> getRubrica() {
        return elencoTelefonico;
    }
    private static HashMap<String, String> elencoTelefonico = new HashMap<>();


    public static void insertKey(String key, String numero) {
        elencoTelefonico.put(key, numero);
    }

    public static String searchWhithvalue(String number) {
        Set<String> chiavi = elencoTelefonico.keySet();
        for (String c: chiavi) {
            String num = elencoTelefonico.get(c);
            if (num.equals(number)) return c;
        }
        return "";
    }

    public static void deleteKeyValue(String key) {
        elencoTelefonico.remove(key);
    }

}


