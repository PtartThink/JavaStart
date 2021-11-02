package c1011b;

public class Girl extends Thread{
    Shuzi shuzi;
    Jingzi jingzi;

    public void run() {
        if(this.getName().equals("chengchen")) {
            synchronized(jingzi) {
                System.out.println("小晨拿起了镜子");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                synchronized(shuzi) {
                    System.out.println("小晨拿起了梳子");
                }
            }
        }else {
            synchronized (shuzi) {
                System.out.println("佳儒拿起了梳子");
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                synchronized(jingzi) {
                    System.out.println("佳儒拿起了镜子");
                }
            }
        }
    }
}
