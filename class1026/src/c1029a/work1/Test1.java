package c1029a.work1;

public class Test1 {
    public static void main(String[] args) {
        MakeOpenWater makeOpenWater = new MakeOpenWater();
        WashCup washCup = new WashCup();
        makeOpenWater.start();
        washCup.start();

    }
}
