package c10182;

public class SoundCard implements Ipci{
    @Override
    public void Start() {
        System.out.println("声卡启动");
    }

    @Override
    public void stop() {
        System.out.println("声卡关闭");
    }

}
