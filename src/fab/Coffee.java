package fab;

public class Coffee {

    //  공통변수
    protected String coffeeName;
    protected int coffeeCapacity;

    public Coffee(String coffeeName, int coffeeCapacity) {
        this.coffeeName = coffeeName;
        this.coffeeCapacity = coffeeCapacity;
    }

    // 객체 초기화를 위해 사용
    public Coffee() {}

    @Override
    public String toString() {
        return "coffeeName='" + coffeeName + '\'' +
                ", coffeeCapacity=" + coffeeCapacity + "ml";
    }
}
