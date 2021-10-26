package h1012.h2;

public class Test {
    public static void main(String[] args) {
        Piano piano1 = new Piano();
        Violin violin1 = new Violin();

        piano1.play();
        violin1.play();

        System.out.println("间隔");
        Player player = new Player();
        player.testplay(new Piano());
        player.testplay(new Violin());
        player.testplay(new Apple());

    }
}
