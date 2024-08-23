package etc.stream;

import java.util.List;

public class Menu_2 {

    public static final List<Dish_1> menuList;
    static {
        menuList = List.of(
                new Dish_1("pork", false, 800, Dish_1.Type.MEAT),
                new Dish_1("beef", false, 700, Dish_1.Type.MEAT),
                new Dish_1("chicken", false, 400, Dish_1.Type.MEAT),
                new Dish_1("french fries", true, 530, Dish_1.Type.OTHER),
                new Dish_1("rice", true, 350, Dish_1.Type.OTHER),
                new Dish_1("season fruit", true, 120, Dish_1.Type.OTHER),
                new Dish_1("pizza", true, 550, Dish_1.Type.OTHER),
                new Dish_1("prawns", false, 400, Dish_1.Type.FISH),
                new Dish_1("salmon", false, 450, Dish_1.Type.FISH)
        );
//        여기까지 stream 2번 작업
    }
}
