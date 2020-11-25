package practice06;

public class Klass {
    private int number;
    private int displayName;

    public void setDisplayName(int displayName) {
        this.displayName = displayName;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + this.displayName;
    }

    public Klass(int number) {
        this.number = number;
        this.setDisplayName(number);
    }
}
