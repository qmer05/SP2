import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args){

        GasolineCar gasolineCar = new GasolineCar("CN62982", "Honda", "Civic", 4, 12);
        System.out.println(gasolineCar);

        DieselCar dieselCar = new DieselCar("BA34657","Mazda", "3",4,26, false);
        System.out.println(dieselCar);
    }
}
