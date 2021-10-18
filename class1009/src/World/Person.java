package World;

public class Person {
    /*姓
    名字
    年龄
    性别
    */
    private String xing;
    private String name;
    private int age;
    private String sex;

    public String getXing() {
        return xing;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setXing(String xing) {
        this.xing = xing;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Person(){

    }
    public Person(String xing,String name,int age,String sex){
        this.xing = xing;
        this.name = name;
        this.age = age;
        this.sex = sex;

    }
}
