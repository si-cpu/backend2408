package oop.inherit.product;

public class displayinfo {

    String productName;
    double price;
    String manufacturer;


    public void ElectronicProduct(String productName, double price, String manufacturer){
        this.productName = productName;
        this.price = price;
        this. manufacturer = manufacturer;
    }

    public void displayInfo(){
        System.out.printf("%s가격 : %.0f원, 제조사 : %s\n", this.productName, this.price, this.manufacturer);
    }
}
