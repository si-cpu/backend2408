package etc.api.lang.wrapper;

import java.time.LocalDateTime;

public class Wrapper {
    public static void main(String[] args) {

        int a = 100;
        boolean b = false;
        char c ='A';
        double d =3.14;

        // boxing : 기본데이터 타입을 객체 타입으로 변환
//        Integer v1 = new Integer(a); // 과거에 썼던 문법 (고어) -> deprecated
//        Boolean v2 = new Boolean(b); // 과거에 썼던 문법 (고어) -> deprecated

//        unboxing : 객체 타입으로 포장된 값을 기본 데이터 타입으로 풀어내는 과정.
//        int i = v1.Intvalue(); 과거에 썼던 문법 (고어) -> deprecated

//        autoBoxing : 기본타입을 자동으로 객체형으로 변환
        Integer v1 = a;
        Boolean v2 = b;
        Character v3 = c;
        Double v4 = d;


        // autounBoxing: 객체 포장을 기본형으로 자동 해제 가능
        int i = v1;
        Double d2 = v4;

        int result = Integer.parseInt("351");
        System.out.println("result = " + result);


    }

}






















