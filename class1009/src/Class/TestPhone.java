package Class;

public class TestPhone {
    public static void main(String[] args) {
        Factory call = new Factory();
        Phone bus = call.call();
        System.out.println(bus.getName());
    }




}
