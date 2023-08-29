package homework_2.seminar_example;

public abstract class ItemFabric {

    public abstract IGameItem createItem();

    public void openReward() {
        IGameItem gameItem = createItem();
        gameItem.open();
    }
    
}