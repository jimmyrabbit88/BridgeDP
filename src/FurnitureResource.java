public class FurnitureResource implements ItemResource{
    Furniture furniture;

    public FurnitureResource(Furniture furniture){
        this.furniture = furniture;
    }

    @Override
    public String providePicture() {
        return furniture.getPicUrl();
    }

    @Override
    public String provideTitle() {
        return furniture.getDescription();
    }

    @Override
    public String provideDescription() {
        return "";
    }

    @Override
    public String providePrice() {
        return ""+furniture.getPrice();
    }
}
