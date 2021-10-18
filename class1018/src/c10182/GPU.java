package c10182;

public class GPU implements Ipci{
    @Override
    public void Start() {
        System.out.println("显卡启动");
    }

    @Override
    public void stop() {
        System.out.println("显卡关闭");
    }
}
