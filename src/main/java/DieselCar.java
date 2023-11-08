public class DieselCar extends AFuelCar {


    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int kmPrLitre = getKmPrLitre();
        if (kmPrLitre >= 20 && kmPrLitre < 50) {
            return 330+130;
        } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
            return 1050+1390;
        } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            return 2340+1850;
        } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
            return 5500+2770;
        } else if (kmPrLitre < 5) {
            return 10470+15260;
        } else return 0;
    }

    public boolean hasParticleFilter(){
        return true;
    }

    @Override
    public String toString(){
        return "Reg. nr: "+registrationNumber+"\nMake: "+ make +"\nModel: "+model+"\nNumber of doors: "+numberOfDoors;
    }

}
