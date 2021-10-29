package c1029a.work1;

public class MakeOpenWater extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("开始烧水");
        for(int i = 1;i<=20;i++){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("■");

        }
        System.out.println("烧水完成");

    }
}
