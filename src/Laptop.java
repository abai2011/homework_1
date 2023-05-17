final public class  Laptop  extends OnScreen{
    private int storage;
    private VideoCard videoCard;
    private int price;
    private Names names;

    public Laptop(int yearOfRelease, String type, int storage, VideoCard videoCard, int price, Names names) {
        super(yearOfRelease, type);
        this.storage = storage;
        this.videoCard = videoCard;
        this.price = price;
        this.names = names;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public int getStorage() {
        return storage;
    }

    public int getPrice() {
        return price;
    }

    public Names getNames() {
        return names;
    }

    public String getInfo(){
        return "Name: "+ getNames() + "\nPrice: "+ getPrice() + "\nStorage: " + getStorage() + "\nVideoCard storage: "+ videoCard.getStorageVideoCard() + "\nVideoCard fps: " + videoCard.getFps();
    }
}
