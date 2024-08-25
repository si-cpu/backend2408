package etc.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static etc.stream.Menu_2.menuList;
import static java.util.Comparator.*;

public class Finding_7 {
    public static void main(String[] args) {

        //메뉴목록에서 채식주의자가 먹을 수있는 요리가 하나라도 존재하는가?
        boolean flag1 = menuList
                .stream()
                .anyMatch(Dish_1::isVegeterian);
        System.out.println("flag1 = " + flag1);
// 전체 15번 완료 !

        //메뉴 목록에서 칼로리가 100이하인 요리가 하나라도 존재하는 가?
        boolean flag2 = menuList
                .stream()
                .anyMatch(dish1 -> dish1.getCalories()<=100);
        System.out.println("flag2 = " + flag2);

        // 음식 메뉴 중에 모든 요리가 1000칼로리 미만인가요?
        boolean flag3 = menuList
                .stream()
                .allMatch(dish1 -> dish1.getCalories() < 1000);
        System.out.println("flag3 = " + flag3);
//  전체 16번 완료!

        // 음식 메뉴 중에 모든 요리가 1000칼로리 미만이 아닙니까?
        //allMatch: 리스트 안에 모든 객체를 검사해서 모두 일치하는지 확인
        //noneMatch: 모두 불일치 하는지를 검사.
        boolean flag4 = menuList
                .stream()
                .noneMatch(dish1 -> dish1.getCalories() < 1000);
        System.out.println("flag4 = " + flag4);

        // 음식 중에 칼로리가 가장 낮은 음식을 조회해주세요.
        Dish_1 dish_1 = menuList.stream()
                .min(comparing(Dish_1::getCalories))
                .get();
        System.out.println("dish_1 = " + dish_1);

        // 음식 중에 칼로리가 가장 높은 음식을 조회해주세요.
        Dish_1 dish_2 = menuList.stream()
                .max(comparing(Dish_1::getCalories))
                .get();
        System.out.println("dish_2 = " + dish_2);
//전체 17번 완료!

    }
}
