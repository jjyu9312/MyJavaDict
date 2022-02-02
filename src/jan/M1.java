package jan;

public class M1 extends Mac{

    boolean AppleSilicon;

    public M1(String kind, int price, boolean appleSilicon) {
        super(kind, price);
        AppleSilicon = appleSilicon;
    }

    boolean hasAppleSilicon(){
        return AppleSilicon;
    }
}
