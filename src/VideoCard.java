public class VideoCard {
    private int storageVideoCard;
    private int fps;

    public int getStorageVideoCard() {
        return storageVideoCard;
    }

    public int getFps() {
        return fps;
    }

    public VideoCard(int storageVideoCard, int fps) {
        this.storageVideoCard = storageVideoCard;
        this.fps = fps;
    }
}
