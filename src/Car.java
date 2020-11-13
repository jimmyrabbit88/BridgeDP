public class Car {
    private String picUrl;
    private String make;
    private String model;
    private String features;
    private int price;

    public Car(String picUrl, String make, String model, String features, int price) {
        this.picUrl = picUrl;
        this.make = make;
        this.model = model;
        this.features = features;
        this.price = price;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }
}
