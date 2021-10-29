package c1029a;

public class Test3 {
    public static void main(String[] args) {
        Test2 test1 = new Test2();
        Test2 test2 = new Test2();
        test1.setName("线程a");
        test2.setName("线程b");
        test1.start();
        test2.start();

    }
}
