public abstract class AFuelCar extends ACar {

    protected int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public abstract String getFuelType();

    public int getKmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return "Reg. nr: " + registrationNumber + "\nMake: " + make + "\nModel: " + model + "\nNumber of doors: "
                + numberOfDoors + "\nKm pr litre: " + kmPrLitre;
    }
}
