package CreationalDesignPatterns.Factory.Tickets;

public class BusTicket implements Ticket{

    @Override
    public int getPrice() {
        return 3;
    }
}
