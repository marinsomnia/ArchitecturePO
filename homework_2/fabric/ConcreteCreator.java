package homework_2.fabric;

// Конкретный класс фабрики
public class ConcreteCreator extends Creator{

    @Override
    public Product createProduct() {
        return new ConcreteProduct(); 
    }    
}
