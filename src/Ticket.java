public class Ticket {
    private String picUrl;
    private String name;
    private String number;
    private String location;
    private String price;

    public Ticket(String picUrl, String name, String number, String location, String price) {
        this.picUrl = picUrl;
        this.name = name;
        this.number = number;
        this.location = location;
        this.price = price;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getLocation() {
        return location;
    }

    public String getPrice() {
        return price;
    }
}
