package h1011;

public class Calculatingsalarycategory {
    public static void pay(SE money){
        System.out.println("程序员工资："+money.getMoney());
    }

    public static void pay(PM money){
        System.out.println("经理工资"+money.getMoney());
    }
}
