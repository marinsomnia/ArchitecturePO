package homework_4;

// Класс, отвечающий за предоставление средств наличными
public class CashProvider {
    private long card;  // номер карт
    private boolean isAuthorized; // состояние авторизации
    private CashRepo cashRepo; // Ссылка на репозиторий для операций с деньгами

    public CashProvider(long card, CashRepo cashRepo) {
        this.card = card;
        this.cashRepo = cashRepo;
        InvariantChecker.checkCashProviderInvariant(this);  // Проверка инвариантов
    }

    // Метод авторизации покупателя
    public boolean authorize(Customer customer) {
        isAuthorized = cashRepo.authorize(customer);  
        return isAuthorized;
    }

    // Метод для совершения покупки
    public boolean buy(double price) {
        if (!isAuthorized) { 
            throw new RuntimeException("Not authorized"); // Не авторизован
        }
        return cashRepo.buy(price);
    }
    public long getCard() {
        return this.card;
    }
}
