package etc.stream;

public class SimpleDish_5 {
    private final String name;
    private final int Calories;

    public SimpleDish_5(final String name, final int calories) {
        this.name = name;
        this.Calories = calories;
    }
    public SimpleDish_5(Dish_1 dish_1){
        this.name = dish_1.getName();
        this.Calories = dish_1.getCalories();
    }

    public String getName() {
        return this.name;
    }

    public int getCalories() {
        return this.Calories;
    }

    @Override
    public String toString() {
        return "SimpleDish_5{" +
                "name='" + name + '\'' +
                ", Calories=" + Calories +
                '}';
    }
}
// 전체 12번 완료
