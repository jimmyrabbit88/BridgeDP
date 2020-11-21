public abstract class Advertisment {
    ItemResource item;

    public Advertisment(ItemResource item){
        this.item = item;
    }

    abstract String display();
}
