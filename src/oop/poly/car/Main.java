package oop.poly.car;

public class Main {

    public static void main(String[] args) {

        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Sonata s3 = new Sonata();

        Porshe p1 = new Porshe();
        Porshe p2 = new Porshe();
        Porshe p3 = new Porshe();

        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();
        Tesla t4 = new Tesla();

//        s1.run();s2.run();s3.run();p1.run();p2.run();p3.run();
//        t1.run();t2.run();t3.run();t4.run();

//        Sonata[] sonatas = {s1, s2, s3};
//        for (Sonata s : sonatas){
//            s.run();
//        }
//


        // 다형성을 적용해서 서로 다른 ㅌ타입들ㅇ르 모아놓을 수 있다.(이종 모음의 배열)
        Car[] cars = {s1, s2, s3, p1, p2, p3, t1,t2, t3, t4};
        for (Car c : cars) {
            c.run();
        }

        System.out.println("========================================================");

        Driver kim = new Driver();
        kim.drive(s1);
        kim.drive(p1);
        kim.drive(t1);

        System.out.println("========================================================");

        Car myTelsla = kim.buyCar("쏘나타");
        myTelsla.run();


    }
}
