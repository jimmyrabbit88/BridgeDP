public class Furniture {
    private String picUrl;
    private String description;
    private float price;

    public Furniture(String picUrl, String description, float price) {
        this.picUrl = picUrl;
        this.description = description;
        this.price = price;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }
}
