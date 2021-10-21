package c1020;

import java.util.Random;
import java.util.Scanner;

public class h1020game {
    //猜拳小游戏：一轮比赛分五局，五局三胜制，电脑随机生成手势，玩家输入手势，当一方提前获得三局胜利，提前结束。否则玩满五局结束。显示比赛结果（存在平局）并告知比分。

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random1 = new Random();
        int input;
        int winPC;
        int winPeople;
        System.out.println("欢迎游玩猜拳小游戏！");

        do {
            System.out.println("1 开始游戏");
            System.out.println("2 退出程序");
            System.out.print("请输入操作符：");
            winPC = 0;
            winPeople = 0;
            input = scan.nextInt();
            while(input<1||input>2){
                System.out.println("输入错误，请重输！");
                input = scan.nextInt();
            }
            switch(input){
                case 1 ->{
                    for(int i = 1;i<=5;i++){
                        //石头 剪子 布
                        // 1   2   3
                        int PC;
                        int People;

                        //if((Math.abs(winPC - winPeople))>=3){
                        if(winPC == 3||winPeople == 3){
                            break;
                        }
                        PC = ((random1.nextInt(3))+1);
                        System.out.print("请出拳！（数字一代表石头，数字二代表剪子，数字三代表布）：");
                        People = scan.nextInt();
                        while(People < 1||People >3){
                            System.out.print("输入错误！请重输：");
                            People = scan.nextInt();
                        }

                        if (People == 1 ){
                            System.out.println("你出了石头！");
                        }
                        if (People == 2 ){
                            System.out.println("你出了剪子！");
                        }
                        if (People == 3 ){
                            System.out.println("你出了布！");
                        }

                        if (PC == 1 ){
                            System.out.println("PC出了石头！");
                        }
                        if (PC == 2 ){
                            System.out.println("PC出了剪子！");
                        }
                        if (PC == 3 ){
                            System.out.println("PC出了布！");
                        }

                        //if((PC == 1&&People == 1)||(PC == 2&&People == 2)||(PC == 3&&People == 3)){
                        if(PC == People){
                            System.out.println("这把平局！");
                        }else if ((PC == 1&&People == 2)||(PC == 2&&People == 3)||(PC == 3&&People == 1)){
                            System.out.println("PC赢了！");
                            winPC++;
                        }else{
                            System.out.println("你赢了！");
                            winPeople++;
                        }




                    }
                    System.out.println("比赛结束！");
                    if(winPC>winPeople){
                        System.out.println("PC最终胜利！");
                    }else if (winPC == winPeople){
                        System.out.println("平局了！");
                    }else {
                        System.out.println("你最终胜利！");
                    }
                    System.out.println("你和PC的最终得分是"+winPeople+":"+winPC);

                    System.out.println("欢迎继续游玩猜拳小游戏！");
                }
                case 2 -> System.out.println("退出程序!");


            }
        }while(input != 2);


    }
}
