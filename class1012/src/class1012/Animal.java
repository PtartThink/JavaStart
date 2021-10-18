package class1012;

public class Animal {

    private int age;
    private String type;
    public void sleep(){
        System.out.println("睡觉中");
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }
}
