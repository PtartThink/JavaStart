package h1026a;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 用户输入字符串
        String str = sc.nextLine();
//        String str = "www.xinla1ng@sina.com";
        System.out.println(str);
        legal(str);

    }

    /**
     * 判断是否为合法的email地址
     * 合法的邮箱地址 ： www.xxxxx@xx.com/cn
     * 例 ： www.asdq@qq.com
     */
    public static void legal(String str) {
        String emailLegal = "^w{3}\\.[\\w]{3,}@(qq|163|sina)\\.(com|cn|com.cn)$";
//        System.out.println(str.matches(emailLegal));
        if (str.matches(emailLegal)) {
            System.out.println("邮箱合法");
        } else {
            throw new RuntimeException("邮箱不合法");
        }
        int num = str.indexOf("@sina");
        if (num > -1) {
            System.out.println("这个邮箱是新浪邮箱");
        }
    }
}