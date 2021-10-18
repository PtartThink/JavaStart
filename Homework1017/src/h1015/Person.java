package h1015;

public class Person {
    private String name;
    private Car car;
    private Phone phone;
    private Tv tv;
    //回家的方法，私家车为，我叫张三，驾驶xx牌，造价为10万的车回家；
    public void goHome() {
        System.out.println("我叫"+name+",驾驶"+car.getBrandString()+"造价是"+car.getPrice()+"的车回家~");
    }
    public void goHome(SubWay subWay){
        System.out.println("我叫"+name+",乘坐"+subWay.getNumber()+"路，公司是"+subWay.getCompany()+"的地铁回家~");
    }
    public void call(){
        System.out.println("我叫"+name+",使用"+phone.getBrandString()+"造价是"+phone.getPrice()+"的电话打电话~");
    }
    public void watchTv(){
        System.out.println("我叫"+name+",使用"+tv.getBrandString()+"造价是"+tv.getPrice()+"的看电视~");
    }
    public String getName() {
        return name;
    }

    public Person() {
        super();
    }

    public Person(String name, Car car) {
        super();
        this.name = name;
        this.car = car;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    public Phone getPhone() {
        return phone;
    }
    public void setPhone(Phone phone) {
        this.phone = phone;
    }
    public Tv getTv() {
        return tv;
    }
    public void setTv(Tv tv) {
        this.tv = tv;
    }
}
