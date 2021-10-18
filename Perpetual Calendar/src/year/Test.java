package year;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("万年历");
        System.out.print("请输入年份:");
        int year = input.nextInt();
        while(year<1970){
            System.out.println("年份不合法！请重输！");
            System.out.print("请输入年份:");
            year = input.nextInt();
        }
        System.out.print("请输入月份:");
        int month = input.nextInt();
        while(month<1||month>12){
            System.out.println("月份不合法！请重输！");
            System.out.print("请输入月份:");
            month = input.nextInt();
        }
        System.out.println("正在输出当月日历.....");

        int Alldays = Calculate.HowManyDays(year,month);
        System.out.println("这个月之前一共经过了"+Alldays+"天。");

        int Start = Calculate.getwhichweek(Alldays);
        System.out.println("这个月第一天是周"+Start+"。");

        int Monthdays = Calculate.getmonthalldays(year,month);
        System.out.println("这个月一共"+Monthdays+"天。");


        System.out.println("一"+"\t"+"二"+"\t"+"三"+"\t"+"四"+"\t"+"五"+"\t"+"六"+"\t"+"七");

        for(int i=1;i<=(Monthdays + (Start - 1));i++){

            int day = i - (Start - 1);
            if(day<=0){
                System.out.print(" "+"\t");
            }else{
                System.out.print(day+"\t");
            }

            if (i%7 == 0){
                System.out.print("\n");
            }


        }








    }
}
