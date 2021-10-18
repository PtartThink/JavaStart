package World;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = 1;
        if(a == 1) {
            System.out.println("请先输入爸爸的信息：");

            System.out.println("请输入爸爸的姓:");
            String addxing = scan.next();
            System.out.println("请输入爸爸的名字:");
            String addname = scan.next();
            System.out.println("请输入爸爸的年龄:");
            int addage = scan.nextInt();
            System.out.println("请输入爸爸的性别:");
            String addsex = scan.next();
            Person addPerson = new Person(addxing, addname, addage, addsex);
            if (God.addPerson(addPerson)) {
                System.out.println("爸爸添加成功");
            } else {
                System.out.println("爸爸没有位置，添加失败");
                System.exit(1);
            }
        }
        int b=1;
        if(b==1){
            System.out.println("请输入妈妈的信息：");

            System.out.println("请输入妈妈的姓:");
            String addxing = scan.next();
            System.out.println("请输入妈妈的名字:");
            String addname = scan.next();
            System.out.println("请输入妈妈的年龄:");
            int addage = scan.nextInt();
            System.out.println("请输入妈妈的性别:");
            String addsex = scan.next();
            Person addPerson = new Person(addxing, addname, addage, addsex);
            if (God.addPerson(addPerson)) {
                System.out.println("妈妈添加成功");
            } else {
                System.out.println("妈妈没有位置，添加失败");
                System.exit(1);
            }

            String p = God.canMakeSon();
            System.out.println(p);

        }



    }
}
