package homework_2.seminar_example;

public class GoldGenerator extends ItemFabric {

    public IGameItem createItem() {

        return new GoldReward();

    }
    
}
