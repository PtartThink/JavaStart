package Class;

public class Phone {

    private String brand;
    private double price;
    private String type;
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone(){

    }
    public Phone(String brand,double price,String type){
        this.brand = brand;
        this.price = price;
        this.type = type;

    }

    public Phone(String brand,String type){
        this.brand = brand;
        this.type = type;
    }

    public Phone(String name,String brand,double price,String type){
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.name = name;
    }
}
