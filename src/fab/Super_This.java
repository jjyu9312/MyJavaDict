package fab;

public class Super_This {

    public static void main(String[] args) {
        Coffee c1 = new Coffee("Americano", 500);
        Coffee c2 = new Coffee("CaffeLatte", 600);

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        System.out.println("========================================================");

        Latte c3 = new Latte("CaffeLatte", 600, 400);
        System.out.println(c3.toString());
    }
}
