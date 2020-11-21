public class PictureAd extends Advertisment{

    public PictureAd(ItemResource item){
        super(item);
    }

    @Override
    String display() {
        String adHtml = "***********************************************\n";
        adHtml += this.item.providePicture() +"\n";
        adHtml += this.item.provideTitle() +"\n";
        adHtml += this.item.provideDescription() +"\n";
        adHtml += "Price: €" + this.item.providePrice() +"\n";
        adHtml += "***********************************************";
        return adHtml;
    }
}
