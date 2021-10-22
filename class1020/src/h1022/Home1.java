package h1022;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Home1 {

    public static void main(String[] args) {
        //通过控制台接收用户输入的两个整数，然后做除法。除数为0的错误。
        //Scanner scanner =new Scanner(System.in);
        int a = 0;
        int b = 0;
        boolean flag;
        do{
            flag = false;
            try{
                Scanner scanner =new Scanner(System.in);
                System.out.println("请输入两个数");
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println(a/b);
            }catch(ArithmeticException e){
                e.printStackTrace();
                System.out.println("除数不能为0");
                flag = true;
            }catch (InputMismatchException e) {
                // TODO: handle exception
                System.out.println("输入有误");
                flag = true;
            }
        }while(flag);

    }

}
