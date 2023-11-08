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

        if (hasParticleFilter) {
            if (kmPrLitre >= 20 && kmPrLitre < 50) {
                return 330 + 130;
            } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
                return 1050 + 1390;
            } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
                return 2340 + 1850;
            } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
                return 5500 + 2770;
            } else if (kmPrLitre < 5) {
                return 10470 + 15260;
            } else return 0;

        } else if (!hasParticleFilter){
            int particleFilterPrice = 1000;
            if (kmPrLitre >= 20 && kmPrLitre < 50) {
                return 330 + 130 + particleFilterPrice;
            } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
                return 1050 + 1390 + particleFilterPrice;
            } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
                return 2340 + 1850 + particleFilterPrice;
            } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
                return 5500 + 2770 + particleFilterPrice;
            } else if (kmPrLitre < 5) {
                return 10470 + 15260 + particleFilterPrice;
            } else return 0;
        }
        else return 0;
    }

    public boolean hasParticleFilter(){
        return true;
    }

    @Override
    public String toString(){
        return "Reg. nr: "+registrationNumber+"\nMake: "+ make +"\nModel: "+model+ "\nNumber of doors: "
                +numberOfDoors+"\nKm pr litre: "+kmPrLitre+"\nHas particle filter: "+hasParticleFilter
                +"\nFuel Type: "+getFuelType()+"\nRegistration fee: "+getRegistrationFee() + " DKK";
    }
}