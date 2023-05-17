public class OnScreen extends Tehnology{
    private String type;

    public OnScreen(int yearOfRelease, String type) {
        super(yearOfRelease);
        this.type = type;
    }

    public String type(String type){
        return type;
    }

    final public String type(){
        return "usual laptop";
    }
}
