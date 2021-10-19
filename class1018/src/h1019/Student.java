package h1019;

public class Student {
    //学号，姓名，年龄
    private int id;
    private String nameString;
    private int age;

    public Student(){
        super();
    }
    public Student(int id,String nameString,int age){
        this.id = id;
        this.age = age;
        this.nameString = nameString;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getNameString() {
        return nameString;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

}
