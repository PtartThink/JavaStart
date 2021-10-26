package homework;

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

public class Hero {
    //英雄的id,名字，位置，攻击力，防御力，生命值。
    private int id;
    private String name;
    private String job;
    private int attk;
    private int def;
    private int hp;

    public Hero() {
    }

    public Hero(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Hero(int id, String name, String job, int attk, int def, int hp) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.attk = attk;
        this.def = def;
        this.hp = hp;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public int getAttk() {
        return attk;
    }
    public void setAttk(int attk) {
        this.attk = attk;
    }
    public int getDef() {
        return def;
    }
    public void setDef(int def) {
        this.def = def;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
}
