package homework_2.decorator;

public class Main {

    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Простой кофе: " + simpleCoffee.getDescription() + ", стоимтость равна " + simpleCoffee.getCost());

        Coffee coffeeWithMilk = new MilkDecorator(simpleCoffee);
        System.out.println("Кофе с молоком: " + coffeeWithMilk.getDescription() + ", стоимтость равна " + coffeeWithMilk.getCost());

        Coffee coffeeWithMilkAndChocolate = new ChocolateDecorator(coffeeWithMilk);
        System.out.println("Кофе с молоком и шоколадом: " + coffeeWithMilkAndChocolate.getDescription() + ", стоимтость равна " + coffeeWithMilkAndChocolate.getCost());

        Coffee chocolateCoffee = new ChocolateDecorator(simpleCoffee);
        System.out.println("Кофе с шоколадом : " + chocolateCoffee.getDescription() + ", стоимтость равна " + chocolateCoffee.getCost());

    }
    
}
