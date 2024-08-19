package oop.abs;

import java.security.PrivateKey;

public abstract class Pet {

    // 공통 속성
    private String name;
    private String kind;
    private int age;

    public Pet(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }


    // 공통 기능
    // 밥먹는 기능
    public abstract void eat();

    //낮잠 기능
    public abstract void takeNap();

    // 산책 기능
    // abstraact 키워드를 붙이면 오버라이딩이 강제가 되기 떄문에, 산책을 못하는 애완동물을 위해 abstract를 제거.
    public void walk(){}

    // 인사 가능
    // abstatic <-> final  개념임...
    public final String sayHello(){
        return "Hello!!" + this.name;
    }

}
