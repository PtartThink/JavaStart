package c1029a;
//自定义线程
public class Test2 extends Thread{
    @Override
    //启动线程以后调用的方法。
    public void run() {
        super.run();
        for(int i = 1;i<=100;i++){
            System.out.println(this.getName()+"    "+i);
        }
    }
}
