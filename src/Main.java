public class Main {
    public static void main(String[] args) {
        VideoCard videoCard = new VideoCard(16, 90);
        Laptop laptop = new Laptop(2006, "laptop", 16, videoCard, 70000 , Names.VICTUS);
        Laptop laptop2 = new Laptop(2012, "laptop", 8, videoCard, 120000 , Names.HP);
        OnScreen onScreen = new OnScreen(2006, "laptop");
        System.out.println(onScreen.type());
        System.out.println(laptop.getInfo());
        System.out.println(laptop2.getInfo());
    }
}