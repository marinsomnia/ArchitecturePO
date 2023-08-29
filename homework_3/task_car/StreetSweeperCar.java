package homework_3.task_car;

// подметальщик улиц

public class StreetSweeperCar extends Car {


    public StreetSweeperCar(String brand, String model, Color color, TypeCar bodyType, int amountWheels,
            TypeFuel fuelType, TypeGearBox gearBoxType, double engineCapacity) {
        super(brand, model, color, bodyType, amountWheels, fuelType, gearBoxType, engineCapacity);
       
    }

    @Override
    public void movement() {} // движение


    @Override
    public  void maintenance() {} // обслуживание

    @Override
    // переключение передач
    public  boolean gearShifting() {
        return true;
    } 

    @Override
    // включение фар
    public  boolean switchHeadlightss() {
        return true;
    }  

    @Override
    // включение дворников
    public  boolean switchWipers() {
        return true;
    } 
    

    // Метод для уличного подметальщика
    public void sweepStreet() {
        
    }
}