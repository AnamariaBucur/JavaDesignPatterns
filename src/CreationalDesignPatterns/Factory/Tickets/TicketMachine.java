package CreationalDesignPatterns.Factory.Tickets;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class TicketMachine {

    //create a HashMap to store possible types of tickets
    //key = ticket type, value = supplier, a snippet code that's going to create a new ticket of the right type
    private static final Map<String, Supplier<Ticket>> ticketMap = new HashMap<>();

    //populate the values in tha Map
    static {
//        ticketMap.put("Bus", () -> new BusTicket());
        ticketMap.put("Bus", BusTicket::new);
        ticketMap.put("Train", TrainTicket::new);
    }

    //Factory method
    Ticket createTicket(String ticketType) {
        if (ticketMap.get(ticketType) != null) {
            return ticketMap.get(ticketType).get();
        } else {
            throw new IllegalArgumentException("Invalid ticket type");
        }

    }
}
