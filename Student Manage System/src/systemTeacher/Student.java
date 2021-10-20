package systemTeacher;

public class Student {
    //学号，姓名，年龄
    private int id;
    private String nameString;
    private int age;

    @Override
    public String toString() {
        return "Student [id=" + id + ", nameString=" + nameString + ", age="
                + age + "]";
    }
    public Student() {
        super();
    }
    public Student(int id, String nameString, int age) {
        super();
        this.id = id;
        this.nameString = nameString;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNameString() {
        return nameString;
    }
    public void setNameString(String nameString) {
        this.nameString = nameString;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
