public class PictureAdFurniture {
    private Furniture furniture;

    public PictureAdFurniture(Furniture furniture) {
        this.furniture = furniture;
    }

    public String display(){
        String adHtml = "***********************************************\n";
        adHtml += this.furniture.getPicUrl() +"\n";
        adHtml += "Discription: " + this.furniture.getDescription() + "\n";
        adHtml += "Price: €"+this.furniture.getPrice() + "\n";
        adHtml += "***********************************************";
        return adHtml;
    }
}
