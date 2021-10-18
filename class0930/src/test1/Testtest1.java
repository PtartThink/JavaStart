package test1;

public class Testtest1 {

    public static void main(String[] args) {
        test1 p1 = new test1();
        p1.setAge(18);
        p1.setName("姓名");
        p1.setSex('女');

        System.out.println(p1.getName());
        System.out.println(p1.getSex());
        System.out.println(p1.getAge());

        test1 p2 = new test1(20,'妖',"tom");
        System.out.println(p2.getName());
        System.out.println(p2.getSex());
        System.out.println(p2.getAge());

    }
}
