//package oop.encap.practice;
//
//import basic.loop.LoopNesting;
//
//public class Product {
//
//    private String name;
//    private int Price;
//    private int stock;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getPrice() {
//        return Price;
//    }
//
//    public void setPrice(int price) {
//        Price = price;
//    }
//
//    public int getStock() {
//        return stock;
//    }
//
//    public void setStock(int stock) {
//        this.stock = stock;
//    }
//
//    public void reduceStock(int quantitiy){
//        if (quantity < 0|| this.stock < quantitiy){
//            System.out.println("요청한 수량이 재고보다 많거나 잘못된 수량입니다.");
//            return;
//        }
//        this.stock -=quantitiy;
//    }
//
//}
