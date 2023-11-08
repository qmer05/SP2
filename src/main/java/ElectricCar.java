public class ElectricCar extends ACar {
    int batteryCapacity;
    int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    @Override
    public int getRegistrationFee() {

        int kmPrL = (int) (100 / (getWhPrKm() / 91.25));

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

    public int getBatteryCapacityKWh() { // returns the battery capacity in kilowatt hours
        return batteryCapacity;
    }

    public int getMaxRangeKm() { // returns the maximum range in kilometres.
        return maxRange;
    }

    public int getWhPrKm() { // returns the power consumption in watt hours per driven kilometre.
        return batteryCapacity * 1000 / maxRange;
    }

    public String toString() {
        return "Reg. nr: " + registrationNumber + "\nMake: " + make + "\nModel: " + model + "\nNumber of doors: "
                + numberOfDoors + "\nBattery capacity: " + batteryCapacity + "\nMax range km: " + maxRange
                + "\nWatt hours pr km: " + getWhPrKm() + "\nRegistration fee: " + getRegistrationFee() + " DKK" + "\n";
    }
}
