package c10182;

public class Test {
    public static void main(String[] args) {
        MainBoard mainBoard1 = new MainBoard();
        Ipci showCard = new GPU();
        Ipci soundCard = new SoundCard();

        mainBoard1.Start(showCard);
        mainBoard1.Start(soundCard);
        mainBoard1.end(showCard);
        mainBoard1.end(soundCard);

    }


}
