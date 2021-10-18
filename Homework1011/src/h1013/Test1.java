package h1013;

public class Test1 {
    public static void main(String[] args) {

        Control control = new Control();
        control.control(new JavaTeacher());
        System.out.println("间隔");
        control.control(new NetTeacher());
        System.out.println("间隔");
        control.control(new DBTeacher());

    }
}
