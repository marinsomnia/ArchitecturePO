package homework_2.decorator;

// Декоратор для добавления шоколада
public class ChocolateDecorator implements Coffee {

    private Coffee coffee;
    public ChocolateDecorator (Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.0;    
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " с шоколадом";
    }
}