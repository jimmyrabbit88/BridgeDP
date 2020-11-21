public class ThumbnailAd extends Advertisment{
    public ThumbnailAd(ItemResource item){
        super(item);
    }

    @Override
    String display() {
        String adHtml = ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n";
        adHtml += this.item.providePicture() +"\n";
        adHtml += "Price: €" + this.item.providePrice() +"\n";
        adHtml += "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<";
        return adHtml;
    }
}
