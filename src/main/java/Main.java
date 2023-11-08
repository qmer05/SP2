import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Car gasolineCar = new GasolineCar("CN62982", "Honda", "Civic", 4, 12);

        Car dieselCar = new DieselCar("BA34657", "Mazda", "3", 4, 26, true);

        Car electricCar = new ElectricCar("DD43598", "Tesla", "S", 5, 68, 280);

        FleetOfCars fleetOfCars = new FleetOfCars();
        fleetOfCars.addCar(gasolineCar);
        fleetOfCars.addCar(dieselCar);
        fleetOfCars.addCar(electricCar);
        System.out.println(fleetOfCars);
        System.out.println("Total registration fee for fleet: " + fleetOfCars.getTotalRegistrationFeeForFleet());
    }
}
