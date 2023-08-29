package homework_2.fabric;

public class CreatePizza extends Creator{

    @Override
    public Product createProduct() {
        return new Pizza(); 
    }    
}