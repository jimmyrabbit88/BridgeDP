public class PictureAdCar {
    private Car car;

    public PictureAdCar(Car car) {
        this.car = car;
    }

    public String display(){
        String adHtml = "***********************************************\n";
        adHtml += this.car.getPicUrl() +"\n";
        adHtml += "Make: "+this.car.getMake() + "\n";
        adHtml += "Model: "+this.car.getModel() + "\n";
        adHtml += "Features: \n"+this.car.getFeatures() + "\n";
        adHtml += "Price: €"+this.car.getPrice() + "\n";
        adHtml += "***********************************************";
        return adHtml;
    }
}
