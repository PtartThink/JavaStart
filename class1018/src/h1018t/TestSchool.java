package h1018t;

public class TestSchool {

    public static void main(String[] args) {
        School school = new School();
        Teacher teacher = new Teacher();
        Printer printer = new Printer();
        school.setPrinter(printer);
        school.print(school);
        school.print(teacher);

    }

}
