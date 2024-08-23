package etc.stream;

public class Dish_1 {

    private final String name;// 요리 이름
    private final boolean vegeterian;// 채식음식 여부
    private final int calories;// 칼로리
    private final Type type;// 요리카테고리

    public enum Type{
        MEAT("육류"), FISH("어류"), OTHER("기타");
        private final String desc;
        Type(String desc){
            this.desc =desc;
        }
    public String getDesc(){
            return desc;
    }

    }
//14번 완료 enum type 수정
    public Dish_1(final String name, final boolean vegeterian, final int calories, final Type type) {
        this.name = name;
        this.vegeterian = vegeterian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public boolean isVegeterian() {
        return this.vegeterian;
    }

    public int getCalories() {
        return this.calories;
    }

    public Type getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "Dish_1{" +
                "name='" + name + '\'' +
                ", vegeterian=" + vegeterian +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }
}
// 여기까지 1번 작업