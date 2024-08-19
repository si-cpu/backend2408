package oop.poly.car;

public class Carshop {

    public void carPrice(Car c){

     /*
        Mammals
           |
        Person
           |
        Student

        Mammals m = new Student();
        m instanceof Person -> True
     */

     if (c instanceof Sonata){
         System.out.println("쏘나타의 가격은 3천만원입니다.");
     }else if (c instanceof Tesla){
         System.out.println("테슬라의 가격은 8천만원입니다.");
     }else if (c instanceof Porshe){
         System.out.println("포르쉐의 가격은 1.5억입니다.");
     }
    }
}
