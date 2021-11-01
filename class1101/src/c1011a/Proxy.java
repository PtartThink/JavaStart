package c1011a;
//代理抢票，共300张，一人100张
public class Proxy extends Thread{
    private Ticket ticket;

    public Proxy(Ticket ticket) {
        this.ticket = ticket;
    }
    public Proxy() {

    }
    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void run() {
        for(int i=1;i<=100;i++) {
            synchronized (ticket){
                System.out.println(this.getName()+"抢到了"+ticket.getId()+"号张票");
                ticket.setId(ticket.getId()+1);
            }

        }
    }
}
