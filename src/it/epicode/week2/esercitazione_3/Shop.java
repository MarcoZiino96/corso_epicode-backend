package it.epicode.week2.esercitazione_3;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

public class Shop {

    public static void main(String[] args) {
        Product p1 = new Product(0, "Le avventure di jo","Books", 105);
        Product p2 = new Product(1, "Sono Adam","Books", 115);
        Product p3 = new Product(0, "Libro","Books", 55);
        Product p4 = new Product(0, "Pensieri di un minatore","Books", 77);
        Product p5 = new Product(0, "Fasciatoio","Baby", 77);
        Product p6 = new Product(0, "biberon","Baby", 5);
        Product p7 = new Product(0, "Poster Juventus","Boys", 3);
        Product p8 = new Product(0, "Monopattino elettrico","Boys", 250);

        Costumer c1 = new Costumer(0, "Marco Ziino", 2);
        Costumer c2 = new Costumer(1, "Fernando Crisafulli", 2);
        Costumer c3 = new Costumer(2, "Fernando Crisafulli", 1);
        Costumer c4 = new Costumer(3, "Lorenzo Afragola", 2);




        Order o1 = new Order(0, "delivered", LocalDate.parse("2023-04-05"),LocalDate.parse("2023-04-05"), c1);
        Order o1 = new Order(0, "delivered", LocalDate.parse("2023-04-05"),LocalDate.parse("2023-04-05"), c1);




        List<Product> productList = List.of(p1,p2,p3,p4,p5,p6,p7,p8);
        //List<Order> = List.of()

        List<Product> booksOver100 = productList.stream().filter(el -> el.getCategory().equals("Books")  && el.getPrice() > 100).toList();
        List<Product> productBaby = productList.stream().filter(el -> el.getCategory().equals("Baby")).toList();
        List<Product> productsBoys = productList.stream().filter(el -> el.getCategory().equals("Boys")).toList();
        printList(productsBoys);
        productsBoys.stream().forEach(el-> el.setPrice(el.applicaSconto(10)));



        printList(booksOver100);
        printList(productBaby);
        printList(productsBoys);


    }

    public static void printList(List<Product> list){
        for (Product i:list){
            System.out.println(i);
        }
    }


}
