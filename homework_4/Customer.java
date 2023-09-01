package homework_4;

import java.util.ArrayList;
import java.util.List;

// Класс покупателя
public class Customer extends User {
    private int id; 
    private CashProvider cashProvider; // Ссылка на провайдера средств
    private double balance; // Баланс
    private String lastError; // Последняя ошибка, возникшая при попытке операции
    private List<Ticket> tickets; // Список билетов покупателя

    public Customer(int id, String name, String email, CashProvider cashProvider, double balance) {
        super(id, name, email);
        this.id = id; 
        this.cashProvider = cashProvider;
        this.balance = balance;
        this.tickets = new ArrayList<>();
        InvariantChecker.checkCustomerInvariant(this);
    }

    public int getId() { 
        return this.id;
    }

    public void setLastError(String lastError) {
        this.lastError = lastError;
    }

    public String getLastError() {
        return this.lastError;
    }

     // Метод для покупки билета
    public boolean buyTicket(Ticket ticket) {
        if (!ticket.getIsValid()) {
            setLastError("Ticket is not valid or already sold");
            return false;
        }

        // Если баланс позволяет купить билет
        if (balance >= ticket.getPrice()) {
            // Если транзакция успешна
            if (cashProvider.buy(ticket.getPrice())) {
                tickets.add(ticket);  // добавляем купленный билет в список
                balance -= ticket.getPrice();
                return true;
            } else {
                setLastError("Failed to complete the transaction"); // Не удалось завершить транзакцию
                return false;
            }
        } else {
            setLastError("Insufficient funds"); //  Недостаточность средств
            return false;
        }
    }
    // Получение списка билетов
    public List<Ticket> getTickets() {
        return this.tickets;
    }

    // Получение текущего баланса
    public double getBalance() {
        return this.balance;
    }
}