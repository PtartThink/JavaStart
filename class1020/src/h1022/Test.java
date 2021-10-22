package h1022;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Teacher teacher = new Teacher();
        try {
            teacher.setAge(11);
        } catch (AgeException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

}
