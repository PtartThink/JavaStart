package c1020;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        Random random1 = new Random();
        int num1 = random1.nextInt();
        System.out.println(num1);
        System.out.println(random1.nextInt());
        //随机生成十个整数，打印出来。

        System.out.println("间隔");
        for(int i=1;i<=10000;i++){
            System.out.println("第"+i+"个");
            System.out.println((random1.nextInt(3))+1);
        }
    }
}
