package homework_3.task_car;

public abstract class Car {

    public String brand; // марка
    public String model;
    public Color color;
    public TypeCar bodyType;  // тип кузова
    public int amountWheels;
    public TypeFuel fuelType;  // тип топлива
    public TypeGearBox gearBoxType;  // тип коробки передач
    public double engineCapacity; // объем двигателя

    public Car(String brand, String model, Color color, TypeCar bodyType, int amountWheels,TypeFuel fuelType, TypeGearBox gearBoxType, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.amountWheels = amountWheels;
        this.fuelType = fuelType;
        this.gearBoxType = gearBoxType;
        this.engineCapacity = engineCapacity;
    }


    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return this.model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Color getColor() {
        return this.color;
    }
    public void setColor(Color color) {
        this.color = color;

    }
    public TypeCar getBodyType() {
        return this.bodyType;
    }
    public void setBodyType(TypeCar bodyType){
        this.bodyType = bodyType;

    }
    public int getAmountWheels() {
        return this.amountWheels;
    }
    public void setAmountWheels(int amountWheels) {
        this.amountWheels = amountWheels;
    }
    public TypeFuel getFuelType() {
        return this.fuelType;
    }
    public void setFuelType(TypeFuel fuelType) {
        this.fuelType = fuelType;
    }
    public TypeGearBox getGearBoxType() {
        return this.gearBoxType;
    }
    public void setGearBoxType(TypeGearBox gearBoxType) {
        this.gearBoxType = gearBoxType;
    }
    public double getEngineCapacity() {
        return this.engineCapacity;
    }
    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void movement() {} // движение

    public  void maintenance() {} // обслуживание

    // переключение передач
    public  boolean gearShifting() {
        return true;
    } 

    // включение фар
    public  boolean switchHeadlightss() {
        return true;
    }  

    // включение дворников
    public  boolean switchWipers() {
        return true;
    } 
    
}