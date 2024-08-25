package etc.stream;

import java.util.Comparator;
import java.util.stream.Collectors;

import static etc.stream.Menu_2.menuList;

public class Sorting_8 {
    public static void main(String[] args) {

        // 육류 요리 중 칼로리가 낮은 순으로 정렬하기
      menuList
              .stream()
              .filter(dish_1 -> dish_1.getType()== Dish_1.Type.MEAT)
              .sorted(Comparator.comparing(Dish_1::getCalories))
              .toList()
              .forEach(d -> System.out.println(d));
        System.out.println("============================================================================================");

      // 모든 메뉴들을 이름으로 내림차순 정렬 (zxy순)
        menuList
                .stream()
                .sorted(Comparator.comparing(Dish_1::getName).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("============================================================================================");

        // 칼로리가 300칼로리보다 큰 요리 중
        // 칼로리 낮은 순으로 앞에서 3개만 필터링
        menuList.stream()
                .filter(Dish_1 -> Dish_1.getCalories() > 300)
                .sorted(Comparator.comparing(Dish_1::getCalories))
                .limit(3)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
