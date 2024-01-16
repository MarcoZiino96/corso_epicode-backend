package it.epicode.week2.esercizio_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci un numero intero per stabilire di quanti numeri è composto l'arrayList");
        int number = input.nextInt();
         ArrayList<Integer> list = creaListRandom(number);
        System.out.println(list);
        System.out.println(listAddReverseList(list));
        pariDispari(list, true);
        pariDispari(list, false);

    }

    public static ArrayList<Integer> creaListRandom(int n){
        ArrayList<Integer> listRandom = new ArrayList<>();

        for (int i = 0; i <n; i++){
            double doubleRandom = (Math.random() * 100) + 1;
            int intRandom = (int) doubleRandom;
            listRandom.add(intRandom);
        }
       return listRandom;
    }

    public static ArrayList<Integer> listAddReverseList(ArrayList<Integer> list){
        ArrayList<Integer> listReverse = new ArrayList<>();
        listReverse.addAll(list);
        listReverse.addAll(list.reversed());
        return listReverse;
    }

    public static void pariDispari(ArrayList<Integer> list,  boolean pari){
        if (pari){
            System.out.println("Numeri pari presenti nella lista");
            for (int i=0; i < list.size();i++){
                if(i % 2 == 0){
                    System.out.println(list.get(i));
                }
            }
        }else{
            System.out.println("Numeri dispari presenti nella lista");
            for (int i=0; i < list.size();i++){
                if(i % 2 != 0){
                    System.out.println(list.get(i));
                }
            }
        }
    }

}
