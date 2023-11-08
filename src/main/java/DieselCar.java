public class DieselCar extends AFuelCar {

    private boolean hasParticleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean hasParticleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.hasParticleFilter = hasParticleFilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {

        int totalFee = 0;

        if (kmPrLitre >= 20 && kmPrLitre < 50) {
            totalFee = 330 + 130;
        } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
            totalFee = 1050 + 1390;
        } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            totalFee = 2340 + 1850;
        } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
            totalFee = 5500 + 2770;
        } else if (kmPrLitre < 5) {
            totalFee = 10470 + 15260;
        }

        if (hasParticleFilter() == false) {
            return totalFee + 1000;
        } else {
            return totalFee;
        }
    }

    public boolean hasParticleFilter() {
        return hasParticleFilter;
    }

    @Override
    public String toString() {
        return "Reg. nr: " + registrationNumber + "\nMake: " + make + "\nModel: " + model + "\nNumber of doors: "
                + numberOfDoors + "\nKm pr litre: " + kmPrLitre + "\nHas particle filter: " + hasParticleFilter
                + "\nFuel Type: " + getFuelType() + "\nRegistration fee: " + getRegistrationFee() + " DKK"+"\n";
    }
}