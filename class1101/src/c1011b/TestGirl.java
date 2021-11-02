package c1011b;

public class TestGirl {

    public static void main(String[] args) {
        Girl girl1 = new Girl();
        Girl girl2 = new Girl();
        girl1.setName("chengchen");
        girl2.setName("jiaru");
        Shuzi shuzi1 = new Shuzi();
        //Shuzi shuzi2 = new Shuzi();
        Jingzi jingzi1 = new Jingzi();
        //Jingzi jingzi2 = new Jingzi();
        girl1.shuzi = shuzi1;
        girl2.shuzi = shuzi1;
        girl1.jingzi = jingzi1;
        girl2.jingzi = jingzi1;
        girl1.start();
        girl2.start();
    }

}
