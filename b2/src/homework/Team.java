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


import java.util.Scanner;

public class Team {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input;
        HeroDao dao = new HeroDao();
        do{
            System.out.println("战队管理系统");
            System.out.println("1.一览英雄信息");
            System.out.println("2.英雄添加");
            System.out.println("3.英雄删除");
            System.out.println("4.英雄修改");
            System.out.println("5.英雄位置查询");
            System.out.println("6.英雄名字查询");
            System.out.println("7.退出程序");
            System.out.println("请输入所需操作：");
            input = scan.nextInt();
            while(input<1||input>7){
                System.out.println("输入错误，请重输！");
                input = scan.nextInt();
            }
            switch (input) {
                case 1 -> {
                    System.out.println("一览英雄信息:");
                    Hero[] hs = dao.getAllHero();//调用dao层，获得所有英雄
                    System.out.println("id\t名字\t位置\t攻击力\t防御力\t血量\t");
                    for (Hero h : hs) {
                        if (h != null) {//不为空打印
                            System.out.println(h.getId() + "\t" + h.getName() + "\t" + h.getJob() + "\t" + h.getAttk() + "\t" + h.getDef() + "\t" + h.getHp() + "\t");
                        }
                    }
                }
                case 2 -> {
                    System.out.println("英雄添加:");
                    System.out.println("请输入要添加的名字");
                    String addName = scan.next();
                    Hero hero = dao.getHeroByName(addName);
                    if(hero==null){//没有重名
                        int addId = dao.getMaxId()+1;//获得最大值
                        System.out.println("请输入要添加的位置");
                        String addJob = scan.next();
                        System.out.println("请输入要添加的攻击力");
                        int addAttk = scan.nextInt();
                        System.out.println("请输入要添加的防御力");
                        int addDef = scan.nextInt();
                        System.out.println("请输入要添加的血量");
                        int addHp = scan.nextInt();
                        Hero addHero = new Hero(addId, addName, addJob, addAttk, addDef, addHp);
                        if(dao.addHero(addHero)){
                            System.out.println("添加成功");
                        }else{
                            System.out.println("没有位置，添加失败");
                        }
                    }else{
                        System.out.println("名字已经存在，添加失败");
                    }
                }


                case 3 -> {
                    System.out.println("英雄删除:");
                    System.out.println("请输入想要删除的名字");
                    String deleteName = scan.next();
                    boolean deleteFlag = dao.deleteHeroByName(deleteName);
                    if (deleteFlag) {
                        System.out.println("删除成功");
                    } else {
                        System.out.println("删除失败");
                    }
                }
                case 4 -> {
                    System.out.println("英雄修改:");
                    System.out.println("请输入要修改的id");
                    int updateId = scan.nextInt();
                    if (dao.getHeroById(updateId)) {
                        System.out.println("请输入要修改的名字");
                        String updateName = scan.next();
                        System.out.println("请输入要修改的位置");
                        String updateJob = scan.next();
                        System.out.println("请输入要修改的攻击力");
                        int updateAttk = scan.nextInt();
                        System.out.println("请输入要修改的防御力");
                        int updateDef = scan.nextInt();
                        System.out.println("请输入要修改的血量");
                        int updateHp = scan.nextInt();
                        Hero updateHero = new Hero(updateId, updateName, updateJob, updateAttk, updateDef, updateHp);
                        dao.updateHero(updateHero);
                        System.out.println("修改成功");
                    } else {
                        System.out.println("id未找到，修改失败");
                    }
                }
                case 5 -> {
                    System.out.println("未完成");
                }
                case 6 -> {
                    System.out.println("英雄名字查询:");
                    System.out.println("请输入要查询的名字");
                    String findName = scan.next();
                    Hero h = dao.getHeroByName(findName);
                    if (h != null) {
                        System.out.println("找到了");
                        System.out.println(h.getId() + "\t" + h.getName() + "\t" +
                                h.getJob() + "\t" + h.getAttk() + "\t" +
                                h.getDef() + "\t" + h.getHp() + "\t");
                    } else {
                        System.out.println("查无此人！");
                    }
                }
                case 7 -> System.out.println("退出程序!");
            }
        }while(input != 7);
    }

}
