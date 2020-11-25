package practice07;

public class Klass {
    private int number;
    private int displayName;
    private Student leader;
    public Student getLeader() {
        return leader;
    }



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

    public void assignLeader(Student student) {
        this.leader = student;
    }
}
