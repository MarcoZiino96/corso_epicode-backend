package it.epicode.week2.esercitazione_3;

import java.time.LocalDate;
import java.util.List;


public class Shop {

    public static void main(String[] args) {
        Product p1 = new Product(0, "Le avventure di jo","Books", 105);
        Product p2 = new Product(1, "Sono Adam","Books", 115);
        Product p3 = new Product(2, "Libro","Books", 55);
        Product p4 = new Product(3, "Pensieri di un minatore","Books", 77);
        Product p5 = new Product(4, "Fasciatoio","Baby", 77);
        Product p6 = new Product(5, "biberon","Baby", 5);
        Product p7 = new Product(6, "Poster Juventus","Boys", 3);
        Product p8 = new Product(7, "Monopattino elettrico","Boys", 250);

        Costumer c1 = new Costumer(0, "Marco Ziino", 2);
        Costumer c2 = new Costumer(1, "Fernando Crisafulli", 2);
        Costumer c3 = new Costumer(2, "Fernando Crisafulli", 1);
        Costumer c4 = new Costumer(3, "Lorenzo Afragola", 2);


        Order o1 = new Order(0, "delivered", LocalDate.parse("2021-02-01"),LocalDate.parse("2023-04-05"), c1);
        Order o2 = new Order(1, "delivered", LocalDate.parse("2021-02-15"),LocalDate.parse("2023-04-05"), c1);
        Order o3 = new Order(2, "delivered", LocalDate.parse("2021-03-01"),LocalDate.parse("2023-04-05"), c2);
        Order o4 = new Order(3, "delivered", LocalDate.parse("2023-04-05"),LocalDate.parse("2023-04-05"), c2);

        o1.addProduct(p1);
        o1.addProduct(p2);
        o1.addProduct(p3);
        o1.addProduct(p4);
        o1.addProduct(p5);
        o1.addProduct(p6);
        o1.addProduct(p7);
        o1.addProduct(p8);


        List<Product> productList = List.of(p1,p2,p3,p4,p5,p6,p7,p8);
        List<Order> orderList = List.of(o1,o2,o3,o4);
        List<Product> booksOver100 = productList.stream().filter(el -> el.getCategory().equals("Books")  && el.getPrice() > 100).toList();
        List<Order> productBaby = orderList.stream().filter(el -> el.getProducts().stream().anyMatch(p->p.getCategory().equals("Baby") )).toList();
        List<Product> productsBoys = productList.stream().filter(el -> el.getCategory().equals("Boys")).toList();
        productsBoys.stream().forEach(el-> el.setPrice(el.applicaSconto(10)));
        List<Product> tier2 = orderList.stream().filter(o->(o.getCostumer().getTier()==2 && o.getLocaldate().isAfter(LocalDate.parse("2021-02-01"))
        && o.getLocaldate().isBefore(LocalDate.parse("2021-03-01")))).map(o-> o.getProducts()).flatMap(o-> o.stream()).distinct().toList();





       // printListP(booksOver100);
          printListO(productBaby);
       // printListP(productsBoys);
        //printListP(tier2);


    }

    public static void printListP(List<Product> list){
        for (Product i:list){
            System.out.println(i);
        }
    }

    public static void printListO(List<Order> list){
        for (Order i:list){
            System.out.println(i);
        }
    }


}
