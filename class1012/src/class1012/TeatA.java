package class1012;

public class TeatA {
    public static void main(String[] args) {
        Dog dogA = new Dog();
        dogA.setAge(10);
        dogA.eat();
        dogA.sleep();
        System.out.println(dogA.getAge());
        Bird birdA = new Bird();
        birdA.eat();
        birdA.sleep();

    }
}
