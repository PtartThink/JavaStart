package h1015;

public class Car {
    private String brandString;
    private double price;

    public Car() {
        super();
    }
    public Car(String brandString, double price) {
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
