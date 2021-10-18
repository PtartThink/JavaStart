package homework.big.work2;

public class Start {

   /*    我的英雄池，
         英雄类：英雄的id,名字，位置，生命值，攻击力，防御力。
            1.遍历：一览英雄信息
            2.英雄添加，ID自动生成，名字不能重名，其余的自己填
            3.根据名字删除英雄，没有名字删除失败
            4.输入ID，修改其他属性
            5.根据位置查询
            6.根据名字查询
            7.退出程序
   */


    private int id;
    private String name;
    private String location; //英雄位置
    private double hp;
    private double attack;
    private double def;


    public Start(){ //无参构造方法
    }


    public Start(int id,String name,String location,double hp,double attack,double def){ //有参构造方法
        this.id = id;
        this.name= name;
        this.location = location;
        this.hp = hp;
        this.attack = attack;
        this.def = def;
    }
    //get部分
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getHp() {
        return hp;
    }

    public double getAttack() {
        return attack;
    }

    public double getDef() {
        return def;
    }
    //set部分


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public void setDef(double def) {
        this.def = def;
    }
    //结束

}
