package homework_4;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Инициализация и авторизация покупателя
        Customer customer = initializeAndAuthorizeCustomer();

        if (customer == null) {
            System.out.println("Authorization failed.");
            return;
        }

        System.out.println("Customer is authorized.");

        // Создание и покупка нового билета
        Ticket ticket = new Ticket(1, 12345, 100, true, new Date());

        if (tryToBuyTicket(customer, ticket)) {
            System.out.println("Successfully bought the ticket!");
            System.out.println("Remaining balance: " + customer.getBalance());
        } else {
            System.out.println("Failed to buy the ticket!");
            printLastError(customer);
        }
    }

    private static Customer initializeAndAuthorizeCustomer() {
        CashRepo cashRepo = new CashRepoImpl();
        CashProvider cashProvider = new CashProvider(1234567890L, cashRepo);
        Customer customer = new Customer(1, "John Doe", "john@example.com", cashProvider, 1000.0);

        return cashProvider.authorize(customer) ? customer : null;
    }

    private static boolean tryToBuyTicket(Customer customer, Ticket ticket) {
        return customer.buyTicket(ticket);
    }

    private static void printLastError(Customer customer) {
        if (customer.getLastError() != null) {
            System.out.println("Error: " + customer.getLastError());
        }
    }
}
