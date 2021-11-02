package c1011a;

public class Test {

    public static void main(String[] args) {
        Ticket ticket = new Ticket(1);
        Proxy p1 = new  Proxy(ticket);
        Proxy p2 = new  Proxy(ticket);
        Proxy p3 = new  Proxy(ticket);
        p1.setName("dk");
        p2.setName("t1");
        p3.setName("edg");
        p1.start();
        p2.start();
        p3.start();

    }

}
