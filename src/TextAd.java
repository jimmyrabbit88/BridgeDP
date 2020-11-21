public class TextAd  extends Advertisment{

    public TextAd(ItemResource item){
        super(item);
    }

    @Override
    String display() {
        String adHtml = "###################################################\n";
        adHtml += this.item.provideTitle() +"\n";
        adHtml += "Price: €" + this.item.providePrice() +"\n";
        adHtml += "###################################################";
        return adHtml;
    }
}
