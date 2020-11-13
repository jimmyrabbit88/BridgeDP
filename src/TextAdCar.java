public class TextAdCar {
    private Car car;

    public TextAdCar(Car car) {
        this.car = car;
    }

    public String display(){
        String adHtml = "###################################################\n";
        adHtml += "Car: "+this.car.getMake() + " " + this.car.getModel()+ "\n";
        adHtml += "Price: €"+this.car.getPrice() + "\n";
        adHtml += "###################################################";
        return adHtml;
    }
}
