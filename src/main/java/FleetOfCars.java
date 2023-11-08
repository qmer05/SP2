import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> cars;

    public FleetOfCars(){
        cars = new ArrayList<>();
    }

    public void addCar(Car c){
        cars.add(c);
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        for (Car car : cars) {
            result.append(car.toString()).append("\n");
        }
        return result.toString();
    }

    public int getTotalRegistrationFeeForFleet(){
        int totalRegistrationFeeForFleet = 0;
        for (Car car : cars){
            totalRegistrationFeeForFleet += car.getRegistrationFee();
        }
        return totalRegistrationFeeForFleet;
    }

}
