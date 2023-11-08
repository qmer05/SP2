public class ElectricCar extends ACar {
    double batteryCapacity;
    double maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    @Override
    public int getRegistrationFee() {

        double kmPrL = (getWhPrKm() / 91.25) / 100;

        if (kmPrL >= 20 && kmPrL < 50) {
            return 330;
        } else if (kmPrL >= 15 && kmPrL < 20) {
            return 1050;
        } else if (kmPrL >= 10 && kmPrL < 15) {
            return 2340;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            return 5500;
        } else if (kmPrL < 5) {
            return 10470;
        } else return 0;
    }

    /*
    For en Elbil gælder de samme regler som for en benzinbil, blot skal man først
    omregne watt-timer pr kilometer til km/l. Det gøres ved at dividere Wh/km med 91,25
    og dernæst dividere 100 med dette tal.

     */

    public double getBatteryCapacityKWh() { // returns the battery capacity in kilowatt hours
        return batteryCapacity;
    }

    public double getMaxRangeKm() { // returns the maximum range in kilometres.
        return maxRange;
    }

    public double getWhPrKm() { // returns the power consumption in watt hours per driven kilometre.
        return (maxRange/batteryCapacity * 1000);
    }

    public String toString() {
        return "Reg. nr: " + registrationNumber + "\nMake: " + make + "\nModel: " + model + "\nNumber of doors: "
                + numberOfDoors + "\nBattery capacity: " + batteryCapacity + "\nMax range km: " + maxRange
                + "\nWatt hours pr km: " + getWhPrKm() + "\nRegistration fee: " + getRegistrationFee() + " DKK" + "\n";
    }

}
