package fab;

public class Latte extends Coffee {
/*
상속 관계에 있을 때 부모(상위) 클래스의 생성자가 호출된 후, 마지막으로 자식(하위) 클래스의 생성자가 호출
클래스를 만들 때 기본 생성자를 만들고 시작하면 좋음.
 */


    // Latte 클래스에만 있는 변수
    protected  int milkCapacity;

    // 기본 생성자 만듬.
    public Latte() {}

    public Latte(String coffeeName, int coffeeCapacity, int milkCapacity) {

        // 부모 클래스에 있는 변수 및 메서드에 접근 -->  생성자 호출
        super(coffeeName, coffeeCapacity);
        // 내 클래스에 있는 변수 및 메서드에 접근 --> 생성자 호출
        this.milkCapacity = milkCapacity;
    }

    @Override
    public String toString() {
        return
                // 부모 클래스에 있는 toString 사용
                super.toString()
                + ", " + "milkCapacity=" + milkCapacity + "ml";
    }
}
