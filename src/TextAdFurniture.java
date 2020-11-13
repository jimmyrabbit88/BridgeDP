public class TextAdFurniture {
    private Furniture furniture;

    public TextAdFurniture(Furniture furniture) {
        this.furniture = furniture;
    }

    public String display(){
        String adHtml = "###################################################\n";
        adHtml += "Item: " + this.furniture.getDescription() + "\n";
        adHtml += "Price: €"+this.furniture.getPrice() + "\n";
        adHtml += "###################################################";
        return adHtml;
    }
}
