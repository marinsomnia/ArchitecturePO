package homework_3.task_car;

// Машина для перевозки грузов
public class TransportCargoCar extends Car{

    public TransportCargoCar(String brand, String model, Color color, TypeCar bodyType, int amountWheels,
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

    // метод перевозки грузов
    public void transportCargo() {
        
    }
    
}