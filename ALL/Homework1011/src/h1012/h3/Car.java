package h1012.h3;

public class Car {
    //	   1）属性
//		汽车品牌  brand
    private String brand;
    //		汽车型号  type
    private String type;
    //		燃油量     ranRL
    private double ranRL;
    //		油箱容量  youRL
    private double youRL;
    //	 2） 构造方法
//		a.空的构造方法
    public Car(){

    }
    //		b.初始化  全部数据  this()
    public Car(String brand, String type, double ranRL, double youRL) {
        this(brand,type);
        this.ranRL = ranRL;
        this.youRL = youRL;
    }
    //		c.初始化  品牌、型号
    public Car(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    //		d.初始化  燃油量、油箱容量
    public Car(double ranRL, double youRL) {
        this.ranRL = ranRL;
        this.youRL = youRL;
    }
    //	           4） 普通方法
//		a.  取得汽车信息   getMsg()
    public String getMsg() {
        return "Car [brand=" + brand + ", type=" + type + ", ranRL=" + ranRL
                + ", youRL=" + youRL + "]";
    }
    //		b.  计算满箱油 能行驶的路径  getKm（）
//		     计算方法：油箱容量 /  燃油量×100
    public double getKm(){
        return youRL/ranRL*100;
    }
    public String getBrand() {
        return brand;
    }



    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getRanRL() {
        return ranRL;
    }
    public void setRanRL(double ranRL) {
        this.ranRL = ranRL;
    }
    public double getYouRL() {
        return youRL;
    }
    public void setYouRL(double youRL) {
        this.youRL = youRL;
    }
}
