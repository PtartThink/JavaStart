package homework.big.work2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dao dao1 = new Dao();
        int input = scan.nextInt();
        do {
            System.out.println("战队管理系统");
            System.out.println("1.一览英雄信息");
            System.out.println("2.英雄添加");
            System.out.println("3.英雄删除");
            System.out.println("4.英雄修改");
            System.out.println("5.英雄位置查询");
            System.out.println("6.英雄名字查询");
            System.out.println("7.退出程序");
            System.out.println("请输入所需操作：");
            switch(input){
                case 1:
                    System.out.println("一览英雄信息:");
                    Start[] hs = dao1.getHeros();
                    System.out.println("id\t名字\t位置\t攻击力\t防御力\t血量\t");
                    for(Start h:hs){
                        if(h!=null){//不为空打印
                            System.out.println(h.getId()+"\t"+h.getName()+"\t"+
                                    h.getLocation()+"\t"+h.getAttack()+"\t"+
                                    h.getDef()+"\t"+h.getHp()+"\t");
                        }
                    }
                    break;
                case 2:
                    System.out.println("英雄添加:");
                    break;
                case 3:
                    System.out.println("英雄删除:");
                    break;
                case 4:
                    System.out.println("英雄修改:");
                    break;
                case 5:
                    System.out.println("英雄位置查询:");
                    break;
                case 6:
                    System.out.println("英雄名字查询:");
                    break;
                case 7:
                    System.out.println("退出程序:");
                    break;
            }
        }while(input != 7);

    }
}
