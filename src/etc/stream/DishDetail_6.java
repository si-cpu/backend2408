package etc.stream;

public class DishDetail_6 {

    private final String dishName;
    private final String type;

    public DishDetail_6(Dish_1 dish_1){
        this.dishName = dish_1.getName();
        this.type = dish_1.getType().getDesc();
    }

    @Override
    public String toString() {
        return "DishDetail_6{" +
                "dishName='" + dishName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    // 전체 14번 완료
}
