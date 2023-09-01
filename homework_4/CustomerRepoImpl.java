package homework_4;

import java.util.ArrayList;
import java.util.List;

// Реализация репозитория покупателей
public class CustomerRepoImpl implements CustomerRepo {
    private List<Customer> customers = new ArrayList<>(); // Список покупателей

    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);  // Добавление покупателя
    }

    @Override
    public Customer getCustomer(int customerId) {
        for (Customer customer : customers) {
            if (customer.getId() == customerId) {
                return customer;  // Покупатель с таким ID найден
            }
        }
        throw new IllegalArgumentException("Customer with ID " + customerId + " not found");

    }
}
