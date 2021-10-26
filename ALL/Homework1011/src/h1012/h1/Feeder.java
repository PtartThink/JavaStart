package h1012.h1;

public class Feeder {
    /*public void feed(Tiger tiger){
        System.out.println("喂养");
        tiger.eat();

    }
    public void feed(Rabbit rabbit){
        System.out.println("喂养");
        rabbit.eat();
    }*/

    public void feed(Animal animal){
        System.out.println("喂养");
        animal.eat();
    }
    //喂养动物
    //父类引用指向子类对象（多态参数）
    //定义方法时使用父类类型，实际调用时，使用子类的类型。

}
