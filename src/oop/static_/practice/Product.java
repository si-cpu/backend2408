package oop.static_.practice;

public class Product {

    private String prioductName;
    private int price;

    public Product(String prioductName, int price) {
        this.prioductName = prioductName;
        this.price = price;
    }

    public void sellProduct(){
        Store.addSale(this.price);
    }
}
