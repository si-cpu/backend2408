package oop.poly.casting;

public class Main {

    public static void main(String[] args) {

        Parent p = new Parent();
        p.n1 = 1;
//        p.n2 = 2;(x)
        p.method1();
        p.method2();
//        p.method3();(x)
        System.out.println("====================================================");

        Child c = new Child();
        c.n1 = 1; // 부모에게 물려받은 필드변수
        c.n2 = 2;

        c.method1();
        c.method2();
        c.method3();

        System.out.println("====================================================");

        // 다형성 적용!
        Parent p2 = new Child();
        p2.n1 = 1;
//        p2.n2 = 2;(x)
        p2.method1();
        p2.method2();
//        p2.method3(); (x)

         /*
         - 다형성이 적용되면 자식 클래스의
          본래의 멤버(필드, 메서드)를 참조하지 못하는 문제가 발생합니다.
          (부모의 정보로 자식객체에 접근하면 자식이 확장한 개념에 대한 정보를 알 방법이 없다.)
         - 이를 해결하기 위해 강제 타입 변환을 사용합니다.
         */

        Child c2 = (Child) p2; // 그냥 객체는 같다. 그러나 시선을 바꾼것이라는 것이다. 하나의 개체로 두개의 변수를 적용한것이다.
                               // 다시말해 c2와 p2의 주소는 같다.
        c2.n2 = 2;
        c2.method3();

        //객체가 2개 생성된것이 아닙니다. 하나의 객체의 접근 방식을 두가지로 늘린것이다.
        System.out.println("c2 = " + c2);
        System.out.println("p2 = " + p2);

        
        // Object 타입의 변수는 어떠한 객체든 담을 수이 있지만, 객체 고유의 기능을 사용하기 위해서는 
        // 형변환이 거의 항상 필요하다.==> Object 자체가 기능이 별게 없음,
        Object obj = new String("안녕하세요!"); // Object 클래스를 남발하지 말자...ㅠㅠ
        String str = (String) obj;
        System.out.println("str.length() = " + str.length());

        // 다형성이 한번도 발생하지 않은 경우에는
        // 강제형변환으로 사용할수없습니다.

        Parent ppp = new Parent();
//        Child ccc = (Child) ppp; (x)   runtime error -> 말이 안되는 문법
        


    }
}
