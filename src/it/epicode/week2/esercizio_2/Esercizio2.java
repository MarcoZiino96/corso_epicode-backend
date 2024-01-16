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

    public static ArrayList<Integer> lististAddReverseList(ArrayList<Integer> list){
        ArrayList<Integer> listReverse = new ArrayList<>();

        listReverse = list.add(list.reversed());

    }

}
