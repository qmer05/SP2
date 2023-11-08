import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args){

        GasolineCar gasolineCarcar = new GasolineCar("CN62982", "Honda", "Civic", 4, 12);
        System.out.println(gasolineCarcar);
        System.out.println("Fuel Type: " + (gasolineCarcar.getFuelType()));
        System.out.println("Registration fee: " + gasolineCarcar.getRegistrationFee() + " DKK\n");

        DieselCar dieselCar = new DieselCar("BA34657","Mazda", "3",4,26);
        System.out.println(dieselCar);
        System.out.println("Fuel Type: " + (dieselCar.getFuelType()));
        System.out.println("Registration fee: " + dieselCar.getRegistrationFee() + " DKK");
        System.out.println(dieselCar.hasParticleFilter());

    }
}
