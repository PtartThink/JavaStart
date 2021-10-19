/*package h1018t;

public class TestSchool {

    public static void main(String[] args) {
        School school = new School();
        Teacher teacher = new Teacher();
        Printer printer = new Printer();
        school.setPrinter(printer);
        school.print(school);
        school.print(teacher);

    }

}*/
package h1018t;

public class TestSchool {

    public static void main(String[] args) {
        School school = new School();
        Teacher teacher = new Teacher();
        Printer printer = new ColorPrinter();
        Printer printer2 = new BlackPrinter();
        school.setPrinter(printer2);
        school.print(school);
        school.print(teacher);
        school.print(new Student());
    }

}

