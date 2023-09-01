package homework_4;

// Интерфейс для репозитория по работе с деньгами
public interface CashRepo {
    boolean authorize(Customer customer);
    boolean buy(double price); 
}