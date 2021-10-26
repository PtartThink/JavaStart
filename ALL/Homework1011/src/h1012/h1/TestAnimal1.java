package h1012.h1;

public class TestAnimal1 {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit();
        Tiger tiger1 = new Tiger();

        rabbit1.eat();
        rabbit1.sleep();
        tiger1.eat();
        tiger1.sleep();

        System.out.println("间隔");

        Feeder feeder = new Feeder();
        feeder.feed(rabbit1);
        feeder.feed(tiger1);
    }

}
