public class Tehnology {
    private int yearOfRelease;

    public Tehnology(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getInfo(){
        return "yearOfRelease: "+ yearOfRelease;
    }

}
