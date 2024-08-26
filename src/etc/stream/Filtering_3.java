package etc.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static etc.stream.Menu_2.menuList;

public class Filtering_3 {

    public static void main(String[] args) {
        
        //요리메뉴중에 채식주의자가 먹을수있는 요리만 필터링
        List<Dish_1> dishList = menuList
                .stream()
                .filter(dish2 -> dish2.isVegeterian()) // Dish_1::isVegeterian은 dish1 -> dish1.isVegeterian()의 단축문법
                .toList(); // import 해준거

        dishList.forEach(System.out::println);
//        dishList.forEach(dish1-> {System.out.println(dish1);)
//        여기까지 전체 3번쨰
//
        System.out.println("====================================================================================");

        // 메뉴 목록중에 육류이면서 600칼로리 미만인 요리 필터링해서 출력
        menuList.stream()
                .filter(dish1 -> dish1.getType() == Dish_1.Type.MEAT
                        && dish1.getCalories() < 600)
                .toList()
                .forEach(System.out::println);
        System.out.println("=======================================================================================");
//        전체 4번쨰 여기까지


        // 메뉴목록에서 요리 이름이 4글자인 것만 필터링
        menuList.stream()
                .filter(dish_1->dish_1.getName().length()==4)
                .toList()
                .forEach(System.out::println);
        System.out.println("==========================================================================");
//        전체 5번 여기까지

        // 칼로리가 300칼로리보다 큰요리
        menuList.stream()
                .filter(dish_1 ->dish_1.getCalories()>300)
                .limit(3)
                .toList()
                .forEach(System.out::println);
        System.out.println("============================================================================");
//        전체 6번
        
        //300칼로리 보다 높은 요리 중 처음 2개 재끼고 필터링
        menuList.stream()
                .filter(dish_1 ->dish_1.getCalories()>300)
                .skip(2)
                .toList()
                .forEach(System.out::println);
        System.out.println("============================================================================");

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 73, 8, 1, 12, 13, 32, 42, 45, 65, 78, 22, 53, 11, 12,32);
//  전체 7번
        
        //리스트에서 짝수만 필터링(중복은 제거)
        numbers.stream()
                .filter(n->n%2 ==0)
                .distinct()
                .toList()
                .forEach(System.out::println);
//전체8번
        






















    }


}

