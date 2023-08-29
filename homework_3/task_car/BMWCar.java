package homework_3.task_car;

public class BMWCar extends Car implements Refuelling, Wiping{


    private int loadCapacity;

    public BMWCar(String brand, String model, Color color, TypeCar bodyType, int amountWheels, TypeFuel fuelType,
            TypeGearBox gearBoxType, double engineCapacity, int loadCapacity) {
        super(brand, model, color, bodyType, amountWheels, fuelType, gearBoxType, engineCapacity);
        this.loadCapacity = loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;

    }

    public int getLoadCapacity() {
        return this.loadCapacity;
    }

    @Override
    public void fuel() {
        // Реализация заправки топливом
    }

    @Override
    public void wipWindshield() {
        // Реализация протирки лобового стекла
    }

    @Override
    public void wipHeadlights() {
        // Реализация протирки фар
    }

    @Override
    public void wipMirrors() {
        // Реализация протирки зеркал
    }
    
}