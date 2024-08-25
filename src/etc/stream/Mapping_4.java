package etc.stream;

// map : 리스트에서 원하는 데이터만 추출
// original : [ {}, {}, {}, {}, {} ]
// filter   : [ {}, {}, {} ]
// map      : [ "", "", "", "", "" ]

import java.util.List;
import java.util.stream.Collectors;

import static etc.stream.Menu_2.menuList;

public class Mapping_4 {

    public static void main(String[] args) {

        // 요리 이름만 추출
        List<String> nameList = menuList.stream()
                .map(Dish_1::getName)
                .collect(Collectors.toList());
        System.out.println(nameList);
        System.out.println("===================================================================");
// 전체 9번 완료
        List<String> words = List.of(
                "safari", "chrome", "ms edge"
                , "opera", "firefox"
        );

        List<Integer> list = words
                .stream()
                .map(String::length)
                .toList();
        System.out.println(list);
// w전체 10번 완료
        // words에서 각요소에 첫글자만 추출
/*
        List<Character> collect = list.stream()
                .map(w -> w.charAt(0))
                .collect(Collectors.toList());
*/
//전체 11번 완료
        
        System.out.println("======================================================================");

        // 메뉴 목록에서 메뉴 일므과 칼로리만 추출해서
        //  새로운 객체로 포장해서 받고 싶음.
        List<SimpleDish_5> simpleDish5 = menuList
                .stream()
                .map(SimpleDish_5::new)
                .collect(Collectors.toList());
        simpleDish5.forEach(System.out::println);

// 전체 13번 완료
        System.out.println("======================================================================");

        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요.
            단, 타입은 MEAT의 경우 육류라고 저장
            FISH는 어류라고 저장, OTHER는 기타라고 저장
         */
        List<DishDetail_6> detailList = menuList
                .stream()
                .filter(dish1 -> dish1.getCalories() > 500)
                .map(DishDetail_6::new)
                .collect(Collectors.toList());
        System.out.println(detailList);
        System.out.println("================================================================================");
//전체 15번 완료

        //메뉴 목록에 있는 요릳르의 총 칼로리 구하기
        int sum = menuList.stream()
                .mapToInt(Dish_1::getCalories)
                .sum();
        System.out.println(sum);
        System.out.println("================================================================================");

        //육류메뉴의 평균 칼로리 구하기
        double averageCaloris = menuList.stream()
                .filter(dish1 -> dish1.getType() == Dish_1.Type.MEAT)
                .mapToInt(Dish_1::getCalories)
                .average()
                .getAsDouble();
        System.out.println(averageCaloris);
//전체 16번 완료!

    }
}
