package Jan;

public class Inheritance_Override {

    public static void main(String[] args) {

        M1 myM1 = new M1("Apple M1 MAX", 2_000_000 ,true);

        System.out.println("kind : " + myM1.kind);
        System.out.println("price : " + myM1.price);
        System.out.println("appleSilicon : " + myM1.AppleSilicon);
        System.out.println();

        Display display = new Display();
        System.out.println("기본 Display 크기 : " + display.myDisplay());

        AirDisplay airDisplay = new AirDisplay();
        System.out.println("기본 AirDisplay 크기 : " + airDisplay.myDisplay());

        ProDisplay proDisplay = new ProDisplay();
        System.out.println("기본 ProDisplay 크기 : " + proDisplay.myDisplay());

    }
}
