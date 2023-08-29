package homework_2.seminar_example;

public class Main {
    public static void main(String[] args) {

        ItemFabric generator = new GoldGenerator();
        generator.openReward();
        generator = new SilverGenerator();
        generator.openReward();
           
    }
    
}
