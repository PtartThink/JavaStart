package c1029a;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("启动");
        for(int i = 1;i<60;i++){
            System.out.print("■");
            Thread.sleep(100);

        }
        System.out.println();
        System.out.println("载入完成");

    }
}
