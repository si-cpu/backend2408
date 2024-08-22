package etc.lambda;

import java.util.List;
import java.util.stream.Collectors;

import static etc.lambda.Color.*;
import static etc.lambda.FilterApple.filter;
import static etc.lambda.FilterApple.filterApple;
import static etc.lambda.MappingApple.*;

public class Main {

    public static void main(String[] args) {
        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(
                  new Apple(80, Green)
                , new Apple(155, Green)
                , new Apple(120, Red)
                , new Apple(97, Red)
                , new Apple(200, Green)
                , new Apple(50, Red)
                , new Apple(85, Yellow)
                , new Apple(75, Yellow)
        );

        System.out.println("=======================녹색 사과만 필터링=======================");

        List<Apple> greenApples = FilterApple.filterGreenApples(appleBasket);
        for (Apple apple : greenApples) {
            System.out.println(apple);
        }


        System.out.println("=======================원하는 색 사과 필터링=======================");

        List<Apple> apples = FilterApple.filterAppleByColor(appleBasket,Red);
        for (Apple apple :apples ) {
            System.out.println(apple);
        }
        System.out.println("=====================================================================");


    //빨강또는 노랑 사과만 필터링
    //익명클래스(annonymous class)
    // new 인터페이스타입() {클래스 내용}
    // 오버라이딩이 필요하다면 즉시 선언하여 사용합니다.
/*        List<Apple> Apples = filterApple(Apple, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == Red || apple.getColor() == Yellow;
            }
        });
        for (Apple apple : Apples) {
            System.out.println(apple);

        }*/
        //녹색이면서 100g이하인 사과만 필터링
        //인터페이스를 구현하는 익명클래스를 담다식으로 선언.(추상메서드가 단 하나일 경우 가능)
        //어차피 filterApple의 두번째 매개값은 무조건 ApplePredicate  타입의 객체가 전다달되어야 하고,
        //ApplePredicte는 추상메서드를 단 1개 가지고 있으니까 굳이 이름을 언급 필요가 없다.
        //게다가 메서드 내부 코드가 단1줄이고, 그게 또 마침 reurn이니 괄호와 return을 생략할 수 있다.


        System.out.println("=========================여러가지 타입의 객체를 필터링=============================");
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        // 매개변수가하나일 경우에는 소괄호 생략 가능. 없거나 두개 이상일떄는 소괄호 붙여야 합니다.
        List<Integer> filter1 = filter(numbers, n -> n % 2 == 1);
        System.out.println(filter1);

        List<String> foods = List.of("짜장면", "짬뽕", "탕수육", "피자", "삼겹살");
        List<String> filter2 = filter(foods, f -> f.length() == 3);
        System.out.println(filter2);

        List<Apple> filter3 = filter(appleBasket, apple -> apple.getWeight() < 100);
        System.out.println(filter3);

        System.out.println("=========================사과의 색상만 맵핑============================");
        List<Color> colorList = mappingAppleByColor(appleBasket);
        System.out.println("colorList = " + colorList);

        System.out.println("=========================숫자를 주면 제곱된 수를 맵핑============================");
        List<Integer> map1 = map(numbers, n -> n * n);
        System.out.println(map1);

        System.out.println("=========================음식이름을 주면 첫 글자만 맵핑============================");
        List<Character> map2 = map(foods, f -> f.charAt(0));
        System.out.println(map2);

        System.out.println("=========================사과 무게만 맵핑============================");
        List<Integer> map3 = map(appleBasket, apple -> apple.getWeight());
        System.out.println(map3);

        List<Integer> collect = appleBasket.stream()
                .map(a -> a.getWeight())
                .collect(Collectors.toList());
        System.out.println(collect);
    }

}
