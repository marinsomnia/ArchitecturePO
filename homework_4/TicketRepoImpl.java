package homework_4;

import java.util.ArrayList;
import java.util.List;

public class  TicketRepoImpl implements TicketRepo {
    private List<Ticket> tickets = new ArrayList<>();

    @Override
    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    @Override
    public boolean isTicketAvailable(long ticketId) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == ticketId) {
                return true; // Билет с таким ID найден, он доступен
            }
        }
        return false;
    }
   
}