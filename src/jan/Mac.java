package jan;

public class Mac {

    public String kind;
    public int price;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Mac(String kind, int price) {
        this.kind = kind;
        this.price = price;
    }
}