package it.epicode.week2.esercitazione_3;


public class Product{
    private long id;
    private String name;
    private String category;
    private double price;
    public Product(long id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public long getId() {
        return id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double applicaSconto (int s){
        return price - (price * s / 100);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
