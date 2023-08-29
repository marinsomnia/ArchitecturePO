package homework_3.seminar_examples.OCP;

public class Main {

    public static void main(String[] args) {
        
        Car car = new Car(120, "легковая");
        System.out.println(car.calculateAllowedSpeed());

        Bus bus = new Bus(100,"пассажирский");
        System.out.println(bus.calculateAllowedSpeed());
    }
    
}