package h1015;

public class Tv {
    private String brandString;
    private double price;

    public Tv() {
        super();
    }
    public Tv(String brandString, double price) {
        super();
        this.brandString = brandString;
        this.price = price;
    }
    public String getBrandString() {
        return brandString;
    }
    public void setBrandString(String brandString) {
        this.brandString = brandString;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
