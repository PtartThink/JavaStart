package homework.day.work0928;

import java.util.Scanner;

public class test1 {

    /**
     * 幸运抽奖
     */
    public static void main(String[] args) {
        String answer; // 标识是否继续
        String userName = ""; // 用户名
        String password = ""; // 密码
        int cardNumber; // 卡号
        boolean isRegister = false; // 标识是否注册
        boolean isLogin = false; // 标识是否登录
        int max = 9999;
        int min = 1000;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("*****欢迎进入奖客富翁系统*****");
            System.out.println("\t1.注册");
            System.out.println("\t2.登录");
            System.out.println("\t3.抽奖");
            System.out.println("***************************");
            System.out.print("请选择菜单：");
            int choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("[奖客富翁系统 > 注册]");
                    System.out.println("请填写个人注册信息：");
                    System.out.print("用户名：");
                    userName = input.next();
                    System.out.print("密码：");
                    password = input.next();
                    // 获取4位随机数作为卡号
                    cardNumber = (int) (Math.random() * (max - min)) + min;
                    System.out.println("\n注册成功，请记好您的会员卡号");
                    System.out.println("用户名\t密码\t会员卡号");
                    System.out.println(userName + "\t" + password + "\t" + cardNumber);
                    isRegister = true; // 注册成功，标志位设置为true
                }
                case 2 -> {
                    System.out.println("[奖客富翁系统 > 登录]");
                    if (isRegister) { // 判断是否注册
                        // 3次输入机会
                        for (int i = 1; i <= 3; i++) {
                            System.out.print("请输入用户名：");
                            String inputName = input.next();
                            System.out.print("请输入密码：");
                            String inputPassword = input.next();
                            if (userName.equals(inputName) && password.equals(inputPassword)) {
                                System.out.println("\n欢迎您：" + userName);
                                isLogin = true; // 登录成功，标志位设置为true
                                break;
                            } else if (i < 3) {
                                System.out.println("用户名或密码错误，还有" + (3 - i) + "次机会！");
                            } else {
                                System.out.println("您3次均输入错误！");
                            }
                        }
                    } else {
                        System.out.println("请先注册，再登录！");
                    }
                }
                case 3 -> {
                    System.out.println("[奖客富翁系统 > 抽奖]");
                    if (!isLogin) { // 判断是否登录
                        System.out.println("请先登录，再抽奖！");
                    } else {
                        //生成5个4位随机数字，并保存在数组中
                        int[] luckynums = new int[5];
                        for (int i = 0; i < luckynums.length; i++) {
                            luckynums[i] = (int) (Math.random() * (max - min)) + min;
                        }
                        System.out.print("请输入您的卡号：");
                        int yourcard = input.nextInt();
                        int i;
                        System.out.print("\n本日的幸运数字为：");
                        for (i = 0; i < luckynums.length; i++) {
                            System.out.print(luckynums[i] + " ");
                        }
                        for (i = 0; i < luckynums.length; i++) {
                            if (luckynums[i] == yourcard) {
                                System.out.println("\n恭喜！您是本日的幸运会员！");
                                break;
                            }
                        }
                        if (i == luckynums.length) {
                            System.out.println("\n抱歉！您不是本日的幸运会员！");
                        }
                    }
                }
                default -> System.out.println("[您的输入有误！]");
            }

            System.out.print("继续吗?(y/n):");
            answer = input.next();
            while (!answer.equals("y") && !answer.equals("n")) {
                System.err.print("输入错误，请重输(y/n):");
                answer = input.next();
            }


        } while ("y".equals(answer));


        System.out.println("系统已经退出！");
    }
}