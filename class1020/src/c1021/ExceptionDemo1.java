package c1021;

public class ExceptionDemo1 {

    public static void main(String[] args) {
        int[] arr = new int[2];
        try{//监听可能出现异常的代码
            System.out.println("小崔去收保护费");
            System.out.println("屁颠屁颠的去了~");
            System.out.println("来到了煎饼果子摊");
            System.out.println("把钱拿出来！");
            System.out.println("沉鱼落雁的姑娘出现了");
            System.out.println(arr[2]);
//			System.out.println("摊主会武术，谁也挡不住");
//			System.out.println(10/0);
        }catch(ArithmeticException ex){//算数异常模拟会武术
            //处理异常
            System.out.println("掏出了枪");
        }catch (ArrayIndexOutOfBoundsException e) {//数组下标越界异常模拟姑娘长的俊的异常
            // TODO: handle exception
            System.out.println("扛回来给大哥做压寨夫人~");
        }
        System.out.println("拿钱走人~");

    }

}
