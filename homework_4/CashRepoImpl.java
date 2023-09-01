package homework_4;

// Реализация репозитория по работе с деньгами
public class CashRepoImpl implements CashRepo {
    @Override
    public boolean authorize(Customer customer) {
        return true; 
    }

    @Override
    public boolean buy(double price) {
        return true; 
    }
}
    