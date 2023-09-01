package homework_4;

// Класс для проверки инвариантов
public class InvariantChecker {
    // Проверка инвариантов для покупателя
    public static void checkCustomerInvariant(Customer customer) {
        // Проверка на наличие корректного ID у покупателя
        if (customer.getId() <= 0) {
            throw new IllegalStateException("Customer ID must be positive");
        }
        // Проверка на наличие корректного списка билетов
        if (customer.getTickets() == null) {
            throw new IllegalStateException("Tickets list cannot be null");
        }
    }
    // Проверка инвариантов для билета
    public static void checkTicketInvariant(Ticket ticket) {
        // Проверка на корректность стоимости билета
        if (ticket.getPrice() <= 0) {
            throw new IllegalStateException("Invalid ticket price");
        }
        if (ticket.getDate() == null) {
            throw new IllegalStateException("Invalid ticket date");
        }
         if (ticket.getId() <= 0) {
            throw new IllegalStateException("Ticket ID must be positive");
        }

          if (ticket.getRouteNumber() <= 0) {
            throw new IllegalStateException("Ticket RouteNumber must be positive");
        }

    }
    // Проверка инвариантов для провайдера средств
    public static void checkCashProviderInvariant(CashProvider cashProvider) {
        //Проверка на наличие корректного номера карты
        if (cashProvider.getCard() <= 0) {
            throw new IllegalStateException("Invalid card number");
        }
    }
}