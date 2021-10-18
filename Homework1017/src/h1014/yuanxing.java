package h1014;

public class yuanxing extends DrawSoft{
    @Override
    public void Draw() {
        System.out.println("绘制圆形");
    }

    private int changdu;
    private int kuandu;
    public int getChangdu(){
        return changdu;
    }


    public int getKuandu() {
        return kuandu;
    }

    public void setchangdu(int changdu) {
        this.changdu = changdu;
    }

    public void setkuandu(int kuandu) {
        kuandu = kuandu;
    }
}
