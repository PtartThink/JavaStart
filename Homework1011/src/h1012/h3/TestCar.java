package h1012.h3;

public class TestCar {

    public static void main(String[] args) {
		/*6 编译测试类，测试 金龙牌型号为GL-0012的公共洗车，其油箱容量为200L，
		  燃油量为3，限乘人数为50人，在满箱油，空车的时候能行驶多少公里，在半箱，
		 车上有20人的时候能走多少公里
		测试，宝马X5，，其油箱容量为50L，燃油量为7，在满箱油的时候能行驶多少公里*/
        Bus bus = new Bus("金龙","GL-0012",3,200,50);
        System.out.println(bus.getKm(200, 1));
        System.out.println(bus.getKm(100,20));
        Car car = new Car("BMW", "X5", 7, 50);
        System.out.println(car.getKm());
    }

}

