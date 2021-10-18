package h1015;

public class TestPerson {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Car car = new Car("BYD",999999);
        Person person = new Person();
        person.setName("张三");
        person.setCar(car);
        person.goHome();
        SubWay subWay = new SubWay(1, "大公");
        person.goHome(subWay);
        Phone phone = new Phone("apple", 7999);
        Tv tv = new Tv("huawei", 3999);
        person.setPhone(phone);
        person.setTv(tv);
        person.call();
        person.watchTv();
    }

}
