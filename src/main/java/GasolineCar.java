public class GasolineCar extends AFuelCar {

    public GasolineCar(int kmPrLitre) {
        super(kmPrLitre);
    }

    @Override
    protected String getFuelType() {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee() {
        return 0;
    }
}
