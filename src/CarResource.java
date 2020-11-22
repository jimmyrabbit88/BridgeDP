public class CarResource implements ItemResource{
    private Car car;

    public CarResource(Car car){
        this.car = car;
    }

    @Override
    public String providePicture() {
        return this.car.getPicUrl();
    }

    @Override
    public String provideTitle() {
        return "Make: " + this.car.getMake() + "\nModel: " + this.car.getModel();
    }

    @Override
    public String provideDescription() {
        return "Features: \n" + this.car.getFeatures();
    }

    @Override
    public String providePrice() {
        return ""+ this.car.getPrice();
    }
}
