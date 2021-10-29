package c1029a.work1;

public class WashCup extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("开始洗杯子");
        for(int i = 1;i<=4;i++){
            for (int q = 1;q<=4;q++){

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //System.out.print("■");

            }
            System.out.println("第"+i+"个杯子洗完了。");

        }
        System.out.println("杯子全部洗好了。");
    }
}
