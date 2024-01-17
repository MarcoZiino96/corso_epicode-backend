package it.epicode.week2.esercitazione_3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private int id;
    private String status;
    private LocalDate localdate;

    private LocalDate deliveryDate;
    private ArrayList<Product> products;
    private Costumer costumer;

    public void setProducts(ArrayList<Product> products) {

        this.products = products;
    }

    public Order(int id, String status, LocalDate localDate, LocalDate deliveryDate, Costumer costumer){
        this.id = id;
        this.status = status;
        this.localdate = localDate;
        this.deliveryDate = deliveryDate;
        this.costumer = costumer;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getLocaldate() {
        return localdate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void removeProduct(Product product){
        products.remove(product);
    }
    public void addProduct (Product product){
        products.add(product);
    }
}
