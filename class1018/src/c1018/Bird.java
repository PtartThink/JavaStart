package c1018;

public class Bird implements Animal,Flyer{
    @Override
    public void eat() {
        System.out.println("吃");
    }

    @Override
    public void fly() {
        System.out.println("飞");
    }
}
