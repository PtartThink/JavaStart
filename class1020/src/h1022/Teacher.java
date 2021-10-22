package h1022;

public class Teacher {
    private String name;
    private int age;
    private int teachAge;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) throws AgeException {
        if(age<25||age>60){
            throw new AgeException();
        }
        this.age = age;
    }
    public int getTeachAge() {
        return teachAge;
    }
    public void setTeachAge(int teachAge) {
        this.teachAge = teachAge;
    }
    public Teacher(String name, int age, int teachAge) {
        super();
        this.name = name;
        this.age = age;
        this.teachAge = teachAge;
    }
    public Teacher() {
        super();
    }

}
