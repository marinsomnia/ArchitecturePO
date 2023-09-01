package homework_4;

// Сервис для покупки билетов
public class TicketService {
    private CashRepo cashRepo;
    private TicketRepo ticketRepo;

    public TicketService(CashRepo cashRepo, TicketRepo ticketRepo) {
        this.cashRepo = cashRepo;
        this.ticketRepo = ticketRepo;
    }

    // Метод для покупки билета 
    public boolean purchaseTicket(Customer customer, Ticket ticket) {
        // Проверка инвариантов для объектов Customer и Ticket
        InvariantChecker.checkCustomerInvariant(customer);
        InvariantChecker.checkTicketInvariant(ticket);

        // Попытка авторизации покупателя
        if (!cashRepo.authorize(customer)) {
            // Установка сообщения об ошибке, если авторизация не удалась
            customer.setLastError("Authorization failed");
            return false;
        }
        // Проверка наличия билета 
        if (!ticketRepo.isTicketAvailable(ticket.getRouteNumber())) {
            // Установка сообщения об ошибке, если билет не доступен
            customer.setLastError("Ticket not available");
            return false;
        }

        // Проверка баланса покупателя
        if (customer.getBalance() < ticket.getPrice()) {
            // Установка сообщения об ошибке, если недостаточно средств
            customer.setLastError("Insufficient funds");
            return false;
        }
        // Покупка билета 
        return customer.buyTicket(ticket);
    }
}
